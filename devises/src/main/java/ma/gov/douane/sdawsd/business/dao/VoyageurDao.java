package ma.gov.douane.sdawsd.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.gov.douane.sdawsd.model.Voyageur;

@RepositoryRestResource
public interface VoyageurDao extends JpaRepository<Voyageur, Long>{

}
