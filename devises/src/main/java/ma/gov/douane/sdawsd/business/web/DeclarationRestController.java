package ma.gov.douane.sdawsd.business.web;

import ma.gov.douane.sdawsd.model.primary.Declaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ma.gov.douane.sdawsd.business.service.DeclarationService;

@RestController
public class DeclarationRestController {

	@Autowired
	private DeclarationService declarationService;
	@CrossOrigin(origins = "http://localhost:4200,http://172.19.144.1:8082")
	@PostMapping(value = "/saveDeclaration")
	public Declaration save(@RequestBody Declaration declaration){

		return declarationService.save(declaration);
	}
	@CrossOrigin(origins = "http://localhost:4200,http://172.19.144.1:8082")
	@GetMapping(value = "/declarationByReference/{reference}")
	public Declaration findByReference(@PathVariable("reference") String reference){
		return declarationService.findByReference(reference);
	}
}
