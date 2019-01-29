/*
 *  Company: RS
 *  Project: pet-clinic-web
 *  Created: 21 sty 2019  22:32:35
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.VetService;

/**
 *<p></p><br>21 sty 2019
 * @author RS
 *
 */
@Controller
public class VetController {

	private final VetService vetService;
	
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}



	@RequestMapping({"vets", "vets/index", "vets/index.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
