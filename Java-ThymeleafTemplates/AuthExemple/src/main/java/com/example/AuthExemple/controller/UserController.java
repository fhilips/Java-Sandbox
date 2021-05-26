package com.example.AuthExemple.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.AuthExemple.model.RoleEnum;
import com.example.AuthExemple.model.Roles;
import com.example.AuthExemple.model.Telefone;
import com.example.AuthExemple.model.User;
import com.example.AuthExemple.services.RoleService;
import com.example.AuthExemple.services.TelefoneService;
import com.example.AuthExemple.services.UserService;

@Controller
public class UserController {

	@Autowired
	private TelefoneService telefoneService;

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("cadastrar")
	public String cadastro(Model model) {

		User user = new User();	
		Roles role = new Roles();
		Telefone tel = new Telefone();
		user.setRoles(role);
		user.setTelefone(tel);
		
		model.addAttribute("user", user);		
		model.addAttribute("roleEnum", RoleEnum.values());
		return "usuario/cadastrar";
	}

	@PostMapping("/cadastrar/novo")
	public String novo(@Valid @ModelAttribute("user") User novoUser,
			@ModelAttribute("roleEnum") String roleEnum) {

		String encodedPassword = passwordEncoder.encode(novoUser.getPassword());

		User usuarioPrincipal = userService.encontraUserPrincipal();
		System.out.println(roleEnum);
		novoUser.setEnumRole(roleEnum.valueOf());
		novoUser.setActive(1);
		novoUser.setPassword(encodedPassword);
		//novoUser.setRoles(usuarioPrincipal.getRoles());
		
				
		userService.salvarUsuario(novoUser);
		telefoneService.salvarTelefone(novoUser.getTelefone());
		return "redirect:/";
	}

	@GetMapping("/mostrar")
	public String mostrar(Model model, Principal principal) {
		
		User usuarioPrincipal = userService.encontraUserPrincipal();
		
		Optional<List<Telefone>> tel = telefoneService.encontraTelefonePeloId(usuarioPrincipal.getId());
		
		if (tel.isPresent()) {
			List<Telefone> telefone = tel.get();
			System.out.println(telefone.get(0).getNumero());
			System.out.println(telefone.get(1).getNumero());
			System.out.println(telefone.size());
			model.addAttribute("telefone", telefone);
		}
		
		Roles role = roleService.encontraRolePeloId(usuarioPrincipal.getRoles().getId());
		System.out.println(role.getNome());
		model.addAttribute("role", role);
		model.addAttribute("usuario", usuarioPrincipal);

		return "usuario/user-info";
	}

	@PostMapping("/alterar")
	public String alterar(@Valid @ModelAttribute("usuario") User userAlterado,
			@ModelAttribute("telefone") Telefone tel,
			@ModelAttribute("role") Roles role) {
		
		String encodedPassword = passwordEncoder.encode(userAlterado.getPassword());	
		User usuarioPrincipal = userService.encontraUserPrincipal();
	
		userAlterado.setId(usuarioPrincipal.getId());	
		userAlterado.setActive(1);
		userAlterado.setPassword(encodedPassword);
		userAlterado.setRoles(usuarioPrincipal.getRoles());
		userAlterado.setTelefone(tel);

		tel.setUsuario(userAlterado);
		
		userService.salvarUsuario(userAlterado);
		//telefoneService.salvarTelefone(tel);
		return "redirect:/";
	}

}
