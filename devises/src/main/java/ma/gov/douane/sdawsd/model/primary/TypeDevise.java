package ma.gov.douane.sdawsd.model.primary;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.*;
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
	@Column(name = "code_devise")
	private String codeDevise;
	@Column(name = "nom_devise")
	private String nomDevise;
}
