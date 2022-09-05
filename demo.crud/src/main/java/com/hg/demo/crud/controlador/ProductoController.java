package com.hg.demo.crud.controlador;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hg.demo.crud.modelo.ProductoDTO;
import com.hg.demo.crud.repositorio.ProductoDAO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/productos")
public class ProductoController {
	
	@Autowired
	private ProductoDAO repository;
	
	@PostMapping("/producto")
	public ProductoDTO create(@Validated @RequestBody ProductoDTO p) {
		return repository.insert(p);
	}
	
	@GetMapping("/")
	public List<ProductoDTO> readAll(){
		return repository.findAll();
		
	}
	
	@PutMapping("/producto/{id}")
	public ProductoDTO update(@PathVariable String id, @Validated @RequestBody ProductoDTO p) {
		return repository.save(p);
	}
	
	@DeleteMapping("/´rpducto/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	

}
