package ma.gov.douane.sdawsd.model.primary;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "POSTE_FRONTALIER_TB")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PointFrontalier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	private String libelle;
	@Column(name = "code_arrond")
	private String codeArrond;

}
