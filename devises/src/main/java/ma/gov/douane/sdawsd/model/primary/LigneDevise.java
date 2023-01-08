package ma.gov.douane.sdawsd.model.primary;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "LIGNE_DEVISE")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class LigneDevise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double montant;

	@ManyToOne
	private TypeDevise typeDevise;
	@JsonIgnore
	@ManyToOne
	private Declaration declaration;

}
