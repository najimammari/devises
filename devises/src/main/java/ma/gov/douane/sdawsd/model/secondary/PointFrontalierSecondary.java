package ma.gov.douane.sdawsd.model.secondary;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name = "POSTE_FRONTALIER_TB",schema = "BADRP2")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PointFrontalierSecondary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String code;
	private String libelle;
	@Column(name = "code_arrond")
	private String codeArrond;	
	@Column(name = "date_fin")
	private Date dateFin;

}
