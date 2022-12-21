package ma.gov.douane.sdawsd.model;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "DEV_DEVISE")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class TypeDevise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codeDevise;
	
	private String nomDevise;
	
	@OneToMany(mappedBy = "typeDevise")
	private Collection<LigneDevise> ligneDevises;
	
	@OneToMany(mappedBy = "typeDevise")
	private Collection<TitrePorteur> titrePorteurs;
	
}
