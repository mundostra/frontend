package org.mundostra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionnaireController {

	@RequestMapping("/Hello")
	public ModelAndView helloWorld() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hi</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
}
