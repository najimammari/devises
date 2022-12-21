package ma.gov.douane.sdawsd.business.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ma.gov.douane.sdawsd.business.service.DeclarationService;

@RestController
public class DeclarationRestController {

	@Autowired
	private DeclarationService declarationService;
}
