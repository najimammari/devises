package ma.gov.douane.sdawsd.model;

import java.io.Serializable;
import java.util.Collection;

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
@Table(name = "VOYAGEUR")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Voyageur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	@OneToOne
	private TypeIdentifiant typeIdentifiant;
	
	private String identifiant;
	
	private String adresseMaroc;
	
	@OneToOne
	private Pays paysNationalite;
	
	private boolean resident;

	@OneToMany(mappedBy = "voyageur")
	private Collection<Declaration> declarations ;
}
