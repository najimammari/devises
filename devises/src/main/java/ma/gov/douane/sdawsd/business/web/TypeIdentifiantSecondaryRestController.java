package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import ma.gov.douane.sdawsd.business.dao.primary.TypeIdentifiantDao;
import ma.gov.douane.sdawsd.model.primary.TypeIdentifiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.TypeIdentifiantSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.TypeIdentifiantSecondary;

@RestController
public class TypeIdentifiantSecondaryRestController {
	
	@Autowired
	private TypeIdentifiantSecondaryDao typeIdentifiantSecondaryDao;
	@Autowired
	private TypeIdentifiantDao typeIdentifiantDao;
	@CrossOrigin(origins = "http://localhost:4200,http://172.19.144.1:8082")
	@GetMapping("/typeIdentifiantSecondaryValide")
	public List<TypeIdentifiant> findAllTypeIdentifiantSecondary(){
		return typeIdentifiantDao.findAll();
	}
}
