package ma.gov.douane.sdawsd.model.primary;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "JUSTIFICATIF")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Justificatif implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String referenceDeclaration;
	
	private String referenceBordereau;
	
	@Enumerated(EnumType.STRING)
	private TypeJustificatif typeJustificatif;
	
	@Lob
	@Column(length=100000)
	private byte[] document;
	
	@OneToOne(mappedBy = "justificatif")
	private Declaration declaration;
	
}
