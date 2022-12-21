package ma.gov.douane.sdawsd.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "DECLARATION")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Declaration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date dateEnregistrement;
	
	private String commentaire;
	
	@Enumerated(EnumType.STRING)
	private SensDeclaration sensDeclaration;
	
	@Enumerated(EnumType.STRING)
	private EtatDeclaration etatDeclaration;
	
	@ManyToOne
	private Voyageur voyageur;
	
	@ManyToOne
	private Voyage voyage;
	
	@OneToMany(mappedBy = "declaration")
	private Collection<LigneDevise> ligneDevises;
	
	@OneToMany(mappedBy = "declaration")
	private Collection<TitrePorteur> titrePorteurs;
	
	@OneToOne
	private Justificatif justificatif;

}
