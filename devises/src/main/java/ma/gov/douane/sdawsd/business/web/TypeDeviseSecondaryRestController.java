package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.TypeDeviseSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.TypeDeviseSecondary;

@RestController
public class TypeDeviseSecondaryRestController {
	
	@Autowired
	private TypeDeviseSecondaryDao typeDeviseSecondaryDao;
	
	@GetMapping("/typeDeviseSecondaryValide")
	public List<TypeDeviseSecondary> findAllPaysSecondary(){
		return typeDeviseSecondaryDao.findAllValide();
	}
}
