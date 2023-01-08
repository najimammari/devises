package ma.gov.douane.sdawsd.business.service.impl;

import ma.gov.douane.sdawsd.business.dao.primary.*;
import ma.gov.douane.sdawsd.model.primary.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.douane.sdawsd.business.service.DeclarationService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

@Service
@Transactional
public class DeclarationServiceImpl implements DeclarationService{

	private DeclarationDao declarationDao;
	private VoyageurDao voyageurDao;
	private VoyageDao voyageDao;
	private LigneDeviseDao ligneDeviseDao;
	private TitrePorteurDao titrePorteurDao;
	private JustificatifDao justificatifDao;

	public DeclarationServiceImpl(DeclarationDao declarationDao, VoyageurDao voyageurDao,
								  VoyageDao voyageDao, LigneDeviseDao ligneDeviseDao,
								  TitrePorteurDao titrePorteurDao,
								  JustificatifDao justificatifDao) {
		this.declarationDao = declarationDao;
		this.voyageurDao = voyageurDao;
		this.voyageDao = voyageDao;
		this.ligneDeviseDao = ligneDeviseDao;
		this.titrePorteurDao = titrePorteurDao;
		this.justificatifDao = justificatifDao;
	}

	public Declaration save(Declaration declaration){
		voyageDao.save(declaration.getVoyage());
		voyageurDao.save(declaration.getVoyageur());
		if(declaration.getSensDeclaration().equals(SensDeclaration.EXPORT)) {
			declaration.getJustificatif().setDocument(declaration.getJustificatif().getContentBase64().getBytes());
			justificatifDao.save(declaration.getJustificatif());
		}
		else {
			declaration.setJustificatif(null);
		}

		Collection<LigneDevise> ligneDevises = new ArrayList<LigneDevise>();
		Collection<TitrePorteur> titrePorteurs = new ArrayList<TitrePorteur>();
		ligneDevises = declaration.getLigneDevises();
		titrePorteurs = declaration.getTitrePorteurs();
		declaration.setLigneDevises(new ArrayList<LigneDevise>());
		declaration.setTitrePorteurs(new ArrayList<TitrePorteur>());
		if(ligneDevises !=null && !ligneDevises.isEmpty()) {
			ligneDevises.forEach(l -> {
				declaration.addLigneDevise(l);
				ligneDeviseDao.save(l);
			});
		}
		if(titrePorteurs !=null && !titrePorteurs.isEmpty()) {
			titrePorteurs.forEach(t -> {
				declaration.addTitrePorteur(t);
				titrePorteurDao.save(t);
			});
		}
		declaration.setEtatDeclaration(EtatDeclaration.VALIDE);
		declaration.setDateEnregistrement(new Date());
		Declaration dec = declarationDao.save(declaration);
		Calendar dateJour = Calendar.getInstance();
		String reference = dateJour.get(Calendar.YEAR) + String.format("%010d", dec.getId());
		dec.setReference(reference);
		return dec;
	}

	@Override
	public Declaration findByReference(String reference) {
		return declarationDao.findAllByReference(reference).get(0);
	}
}
