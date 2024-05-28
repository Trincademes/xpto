package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Categoria;
import com.example.demo.repositories.CategoriaRepository;


@Service
public class CategoriaService {
	private final CategoriaRepository categoriaRepository;

	@Autowired
	public CategoriaService(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	public List<Categoria> getAllCategoria(Categoria categoria) {
		return categoriaRepository.findAll();
	}

	public Categoria getCategoriaById(Long id) {
		return categoriaRepository.findById(id).orElse(null);

	}		


}