package ma.gov.douane.sdawsd;

import ma.gov.douane.sdawsd.business.dao.primary.*;
import ma.gov.douane.sdawsd.model.primary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Transactional
@SpringBootApplication
public class DevisesApplication implements CommandLineRunner {

	@Autowired
	private DeclarationDao declarationDao;
	@Autowired
	private VoyageurDao voyageurDao;
	@Autowired
	private VoyageDao voyageDao;
	@Autowired
	private LigneDeviseDao ligneDeviseDao;
	@Autowired
	private TypeDeviseDao typeDeviseDao;
	@Autowired
	private PointFrontalierDao pf;
	@Autowired
	private PaysDao paysDao;
	@Autowired
	private TypeIdentifiantDao typeIdentifiantDao;
	public static void main(String[] args) {
		SpringApplication.run(DevisesApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//		LigneDevise l1 = new LigneDevise(null,500,typeDeviseDao.findById(Long.valueOf(2)).get(),null);
//		LigneDevise l2 = new LigneDevise(null,800,typeDeviseDao.findById(Long.valueOf(3)).get(),null);
//		LigneDevise l3 = new LigneDevise(null,900,typeDeviseDao.findById(Long.valueOf(4)).get(),null);
//
//		Voyage voyage = new Voyage(null,new Date(),pf.findById(Long.valueOf(2)).get(),paysDao.findById(Long.valueOf(2)).get(),null);
//		Voyageur voyageur = new Voyageur(null,"AMMARI","Najim",typeIdentifiantDao.findById(Long.valueOf(1)).get(),"AD167834","N 34 skikima temara maroc",paysDao.findById(Long.valueOf(6)).get(),true,null);
//		voyageDao.save(voyage);
//		voyageurDao.save(voyageur);
//		Collection<LigneDevise> devises = new ArrayList<LigneDevise>();
//		devises.add(l1);
//		devises.add(l2);
//		devises.add(l3);
//		Declaration dec = new Declaration(null,new Date(),"commentaire",SensDeclaration.IMPORT,EtatDeclaration.VALIDE,voyageur,voyage,new ArrayList<LigneDevise>(),null,null);
//		dec.addLigneDevise(l1);
//		dec.addLigneDevise(l2);
//		dec.addLigneDevise(l3);
//		ligneDeviseDao.save(l1);
//		ligneDeviseDao.save(l2);
//		ligneDeviseDao.save(l3);
//		declarationDao.save(dec);

	}
}
