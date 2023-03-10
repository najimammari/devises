package ma.gov.douane.sdawsd.business.dao.secondary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ma.gov.douane.sdawsd.model.secondary.PaysSecondary;



@RepositoryRestResource
public interface PaysSecondaryDao extends JpaRepository<PaysSecondary, String>{

	@RestResource(path = "/paysSecondary")
	@Query("select p from PaysSecondary p where p.dateFin > sysdate()")
    public List<PaysSecondary> findAllValide();
}
