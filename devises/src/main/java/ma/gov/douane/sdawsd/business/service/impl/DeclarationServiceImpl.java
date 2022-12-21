package ma.gov.douane.sdawsd.business.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.douane.sdawsd.business.dao.DeclarationDao;
import ma.gov.douane.sdawsd.business.service.DeclarationService;

@Service
@Transactional
public class DeclarationServiceImpl implements DeclarationService{

	private DeclarationDao declarationDao;

	public DeclarationServiceImpl(DeclarationDao declarationDao) {
		super();
		this.declarationDao = declarationDao;
	}
	
	
}
