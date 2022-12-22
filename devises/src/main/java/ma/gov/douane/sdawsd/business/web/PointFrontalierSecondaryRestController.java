package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.PointFrontalierSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.PointFrontalierSecondary;

@RestController
public class PointFrontalierSecondaryRestController {
	
	@Autowired
	private PointFrontalierSecondaryDao pointFrontalierSecondaryDao;
	
	@GetMapping("/pointFrontalierSecondaryValide")
	public List<PointFrontalierSecondary> findAllPaysSecondary(){
		return pointFrontalierSecondaryDao.findAllValide();
	}
}
