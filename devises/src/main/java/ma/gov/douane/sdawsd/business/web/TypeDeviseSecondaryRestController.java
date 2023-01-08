package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import ma.gov.douane.sdawsd.business.dao.primary.TypeDeviseDao;
import ma.gov.douane.sdawsd.model.primary.TypeDevise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.TypeDeviseSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.TypeDeviseSecondary;

@RestController
public class TypeDeviseSecondaryRestController {
	
	@Autowired
	private TypeDeviseSecondaryDao typeDeviseSecondaryDao;
	@Autowired
	private TypeDeviseDao typeDeviseDao;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/typeDeviseSecondaryValide")
	public List<TypeDevise> findAllTypeDeviseSecondary(){
		return typeDeviseDao.findAll();
	}
}
