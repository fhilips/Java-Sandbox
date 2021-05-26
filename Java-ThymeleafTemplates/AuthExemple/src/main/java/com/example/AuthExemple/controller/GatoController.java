package com.example.AuthExemple.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.AuthExemple.dto.ReqNovoGato;
import com.example.AuthExemple.model.Gato;
import com.example.AuthExemple.repository.GatoRepository;




@Controller
@RequestMapping
public class GatoController {
	@Autowired
	GatoRepository gatoRepository;
	
	@GetMapping("/form")
	public String gato(Model model) {
		ReqNovoGato gato  = new ReqNovoGato();
		model.addAttribute("gato", gato);
        return "gato/gato";		
	}
	
	@PostMapping("/novo")
	public String salvarGato(@ModelAttribute("gato") ReqNovoGato gato) {
		
		System.out.println("t");
		Gato gatoN = gato.toGato();
		gatoRepository.save(gatoN);
		
		return "redirect:/";
	}
	
}
