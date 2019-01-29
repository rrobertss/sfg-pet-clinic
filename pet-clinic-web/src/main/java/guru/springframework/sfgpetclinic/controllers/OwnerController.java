/*
 *  Company: RS
 *  Project: pet-clinic-web
 *  Created: 22 sty 2019  21:16:28
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.OwnerService;

/**
 *<p></p><br>22 sty 2019
 * @author RS
 *
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;

	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}



	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		
		return "owners/index";
	}
}
