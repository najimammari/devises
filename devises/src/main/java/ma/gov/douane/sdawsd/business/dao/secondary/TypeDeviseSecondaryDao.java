package ma.gov.douane.sdawsd.business.dao.secondary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ma.gov.douane.sdawsd.model.secondary.TypeDeviseSecondary;



@RepositoryRestResource
public interface TypeDeviseSecondaryDao extends JpaRepository<TypeDeviseSecondary, String>{

	@RestResource(path = "/typeDeviseSecondaryValide")
	@Query("select d from TypeDeviseSecondary d where d.dateFin > sysdate()")
    public List<TypeDeviseSecondary> findAllValide();
}
