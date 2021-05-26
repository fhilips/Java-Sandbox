package net.javaguides.springboot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.javaguides.springboot.model.Gato;
import net.javaguides.springboot.repository.GatoRepository;


@Controller
public class GatoController {
	@Autowired
	GatoRepository gatoRepository;
	
	@GetMapping("/form")
	public String gato(Model model) {
		Gato gato  = new Gato();
		model.addAttribute("gato", gato);
        return "gato";		
	}
	
	@PostMapping("/novo")
	public String salvarGato(@ModelAttribute("gato") Gato gato) {
				
		gatoRepository.save(gato);
		
		return "redirect:/";
	}
	
}
