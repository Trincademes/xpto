package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Livro;
import com.example.demo.repositories.LivroRepository;


@Service
public class LivroService {
	private final LivroRepository livroRepository;

	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	public List<Livro> getAllLivro(Livro livro) {
		return livroRepository.findAll();
	}

	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);

	}		


}