package ma.gov.douane.sdawsd.business.dao.secondary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ma.gov.douane.sdawsd.model.secondary.PointFrontalierSecondary;



@RepositoryRestResource
public interface PointFrontalierSecondaryDao extends JpaRepository<PointFrontalierSecondary, String>{

	@RestResource(path = "/pointFrontalierSecondaryValide")
	@Query("select p from PointFrontalierSecondary p where p.dateFin > sysdate()")
    public List<PointFrontalierSecondary> findAllWithDateFinAfter();
}
