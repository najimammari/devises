package ma.gov.douane.sdawsd.business.dao.secondary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ma.gov.douane.sdawsd.model.secondary.TypeIdentifiantSecondary;



@RepositoryRestResource
public interface TypeIdentifiantSecondaryDao extends JpaRepository<TypeIdentifiantSecondary, String>{

	@RestResource(path = "/typeIdentifiantSecondaryValide")
	@Query("select ti from TypeIdentifiantSecondary ti where ti.code IN ('01','02','03')")
    public List<TypeIdentifiantSecondary> findAllValide();
}
