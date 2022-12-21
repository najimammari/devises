package ma.gov.douane.sdawsd.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.gov.douane.sdawsd.model.TypeDevise;

@RepositoryRestResource
public interface TypeDeviseDao extends JpaRepository<TypeDevise, Long>{

}
