package ma.gov.douane.sdawsd.business.web;

import java.util.List;

import ma.gov.douane.sdawsd.business.dao.primary.PointFrontalierDao;
import ma.gov.douane.sdawsd.model.primary.PointFrontalier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.dao.secondary.PointFrontalierSecondaryDao;
import ma.gov.douane.sdawsd.model.secondary.PointFrontalierSecondary;

@RestController
public class PointFrontalierSecondaryRestController {
	
	@Autowired
	private PointFrontalierSecondaryDao pointFrontalierSecondaryDao;
	@Autowired
	private PointFrontalierDao pointFrontalierDao;
	@CrossOrigin(origins = "http://localhost:4200,http://172.19.144.1:8082")
	@GetMapping("/pointFrontalierSecondaryValide")
	public List<PointFrontalier> findAllPointFrontalierSecondary(){
		return pointFrontalierDao.findAll();
	}
}
