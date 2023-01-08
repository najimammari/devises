package ma.gov.douane.sdawsd.business.service;

import ma.gov.douane.sdawsd.business.dao.primary.DeclarationDao;
import ma.gov.douane.sdawsd.model.primary.Declaration;

import java.util.Collection;

public interface DeclarationService {

    public Declaration save(Declaration declaration);
    public Declaration findByReference(String reference);

}
