package ma.gov.douane.sdawsd.business.dao.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.gov.douane.sdawsd.model.primary.PointFrontalier;

@RepositoryRestResource
public interface PointFrontalierDao extends JpaRepository<PointFrontalier, Long>{

}
