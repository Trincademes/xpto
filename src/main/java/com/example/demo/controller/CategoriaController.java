package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Categoria;
import com.example.demo.services.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private final CategoriaService categoriaService;

	public CategoriaController(CategoriaService CategoriaService) {
		this.categoriaService = CategoriaService;
	}
	@GetMapping("/home")
	public String paginainicial() {
		return "index";

	}


	@PostMapping
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return categoriaService.saveCategoria(categoria);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getCategoria(@PathVariable Long id) {
		Categoria categoria = categoriaService.getCategoriaById(id);
		if (categoria != null) {
			return ResponseEntity.ok(categoria);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

}
