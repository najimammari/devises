package ma.gov.douane.sdawsd.business.web;

import ma.gov.douane.sdawsd.business.dao.primary.PaysDao;
import ma.gov.douane.sdawsd.business.dao.secondary.PaysSecondaryDao;
import ma.gov.douane.sdawsd.model.primary.NatureTitre;
import ma.gov.douane.sdawsd.model.primary.Pays;
import ma.gov.douane.sdawsd.model.primary.TypeJustificatif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class EnumRestController {
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/natureTitres")
	public List<String> findAllNatureTitres(){
		return Stream.of(NatureTitre.values()).map(n -> n.getEnumValue()).collect(Collectors.toList());
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/typeJustificatif")
	public List<String> findAllTypeJustificatif(){
		return Stream.of(TypeJustificatif.values()).map(n -> n.getEnumValue()).collect(Collectors.toList());
	}
}
