package com.gf;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	@Transactional
	public class UsuarioService {
	 
	   @Autowired
	   private  UsuarioRepository repo;
	     
	    public List<Usuario> listAll() {
	        return (List<Usuario>) repo.findAll();
	    }
	     
	    public void save(Usuario product) {
	        repo.save(product);
	    }
	     
	    public Usuario get(String id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(String id) {
	        repo.deleteById(id);
	    }

}
