package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.TypeIdentifiantSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.TypeIdentifiantSecondary;

@RestController
public class TypeIdentifiantSecondaryRestController {
	
	@Autowired
	private TypeIdentifiantSecondaryDao typeIdentifiantSecondaryDao;
	
	@GetMapping("/typeIdentifiantSecondaryValide")
	public List<TypeIdentifiantSecondary> findAllPaysSecondary(){
		return typeIdentifiantSecondaryDao.findAllValide();
	}
}
