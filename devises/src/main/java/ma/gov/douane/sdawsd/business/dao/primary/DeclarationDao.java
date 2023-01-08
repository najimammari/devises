package ma.gov.douane.sdawsd.business.dao.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.gov.douane.sdawsd.model.primary.Declaration;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource
public interface DeclarationDao extends JpaRepository<Declaration, Long>{

    public List<Declaration> findAllByReference(String reference);
}
