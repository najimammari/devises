package ma.gov.douane.sdawsd.model.secondary;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "TYPE_DOCUMENT_IDENTITE_TB",schema = "DB_DEVISES")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class TypeIdentifiantSecondary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id	
	private String code;
	private String libelle;
}
