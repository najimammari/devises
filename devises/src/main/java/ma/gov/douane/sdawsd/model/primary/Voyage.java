package ma.gov.douane.sdawsd.model.primary;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "VOYAGE")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Voyage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date dateArrive;
	
	@OneToOne
	private PointFrontalier pointFrontalier;
	
	@OneToOne
	private Pays paysProvenance;
}
