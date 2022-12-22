package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.PaysSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.PaysSecondary;

@RestController
public class PaysSecondaryRestController {
	
	@Autowired
	private PaysSecondaryDao paysSecondaryDao;
	
	@GetMapping("/paysSecondaryValide")
	public List<PaysSecondary> findAllPaysSecondary(){
		return paysSecondaryDao.findAllValide();
	}
}
