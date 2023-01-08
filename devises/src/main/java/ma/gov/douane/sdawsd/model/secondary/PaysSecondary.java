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
@Table(name = "PAY_PAYS",schema = "DB_DEVISES")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PaysSecondary implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private String codePays;
	@Column(name = "pay_var_nompays")
	private String nomPays;
	@Column(name = "pay_dat_datefin")
	private Date dateFin;
}
