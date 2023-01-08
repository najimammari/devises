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
@Table(name = "DEV_DEVISE",schema = "DB_DEVISES")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class TypeDeviseSecondary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id	
	@Column(name = "dev_var_codedevise")
	private String codeDevise;
	@Column(name = "dev_var_descriptiondevise")
	private String nomDevise;
	@Column(name = "dev_dat_datefin")
	private Date dateFin;
	
}
