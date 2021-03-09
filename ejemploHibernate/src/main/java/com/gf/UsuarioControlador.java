package com.gf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class UsuarioControlador {
	
	@Autowired
	//UsuarioDao usuarioDAO;
	//UsuarioRepository usuarioRepositorio;
	UsuarioService usuarioService;
	@RequestMapping(value = "/create")
	@ResponseBody
	public String create(String nombre, String descripcion) {
		try {
			Usuario usuario = new Usuario();
			usuario.setNombre("RUTH");
			usuario.setApellidos("FERNANDEZ FERNANDEZ");
			usuarioService.save(usuario);
		} catch (Exception ex) {
			return "Error al crear el usuario";
		}
		return "Usuario creado correctamente";
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public String delete(String id) {
		try {
			Usuario usuario = new Usuario();
			usuario.setNombre(id);
			usuarioService.delete(id);
		} catch (Exception ex) {
			return "Error al eliminar el usuario";
		}
		return "Usuario eliminado correctamente";
	}

	
	@RequestMapping(value = "/list")
	public String viewHomePage(Model model) {
	    List<Usuario> lista= (List<Usuario>) usuarioService.listAll();
	    System.out.println(lista.get(0).getNombre());
	    model.addAttribute("listaNombres", lista);
	     
	    return "index";
	}

	
}
