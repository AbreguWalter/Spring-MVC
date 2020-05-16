package com.bolsadeideas.springboot.web.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bolsadeideas.springboot.web.models.Usuario;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {
	
//	@RequestMapping(value = "/index",method = RequestMethod.GET)
//	@GetMapping(value = "/index")
	@GetMapping({"/index","/","/home"})
	//ModelMap model -- Model model -- Map<String,Object> map -- ModelAndView mv
	public String index(Model model) {
		//map.put("titulo","Hola Spring Framework usando Map");
		model.addAttribute("titulo","Hola Spring");
		return "index";
//		mv.addObject("titulo","Hola Spring Framework usando ModelAndBiew");
//		mv.setViewName("index");
//		return mv;
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Walter");
		usuario.setApellido("Abregu");
		usuario.setEmail("abreguwalter0709@gmail.com");
		
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo","Perfil del usuario : ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		
		model.addAttribute("titulo","Lista de usuarios");
//		model.addAttribute("usuarios",usuarios);
		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	//Se utiliza cuando necesitas datos comunes en todos los metodos
	//Metodo comun para todas las vistas
	//Datos para la vista como select radiobuton es para poblar datos.
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		//Arrays.asList(); se ponen los elementos separados por comas
		usuarios.add(new Usuario("Andres","Guzman","andre@gmail.com"));
		usuarios.add(new Usuario("Walter","Tinoco","walter@gmail.com"));
		usuarios.add(new Usuario("Ashly","gutierrez","ashly@gmail.com"));
		return usuarios;
	}
	
	
	
	
	
	
	
}
