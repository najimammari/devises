package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import ma.gov.douane.sdawsd.business.dao.primary.PaysDao;
import ma.gov.douane.sdawsd.model.primary.Pays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.PaysSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.PaysSecondary;

@RestController
public class PaysSecondaryRestController {
	
	@Autowired
	private PaysSecondaryDao paysSecondaryDao;
	@Autowired
	private PaysDao paysDao;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/paysSecondaryValide")
	public List<Pays> findAllPaysSecondary(){
		return paysDao.findAll();
	}
}
