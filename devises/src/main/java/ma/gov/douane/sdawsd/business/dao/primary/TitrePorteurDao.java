package ma.gov.douane.sdawsd.business.dao.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.gov.douane.sdawsd.model.primary.TitrePorteur;

@RepositoryRestResource
public interface TitrePorteurDao extends JpaRepository<TitrePorteur, Long>{

}
