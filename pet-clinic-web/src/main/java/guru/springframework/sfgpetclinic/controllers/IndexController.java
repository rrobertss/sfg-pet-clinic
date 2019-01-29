/*
 *  Company: RS
 *  Project: pet-clinic-web
 *  Created: 19 sty 2019  00:50:29
 *  Author:  RS
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *<p></p><br>19 sty 2019
 * @author RS
 *
 */
@Controller
public class IndexController {

	@RequestMapping({"", "/", "index", "index.html"})
	public String index() {
		return "index";
	}
	
}
