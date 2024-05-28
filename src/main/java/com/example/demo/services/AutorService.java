package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;


@Service
public class AutorService {
	private final AutorRepository autorRepository;

	@Autowired
	public AutorService(AutorRepository autorRepository) {
		this.autorRepository = autorRepository;
	}

	public Autor saveAutor(Autor autor) {
		return autorRepository.save(autor);
	}

	public List<Autor> getAllLivro() {
		return autorRepository.findAll();
	}

	public Autor getAutorById(Long id) {
		return autorRepository.findById(id).orElse(null);

	}


	public Autor updateAutor(Long id, Autor novoAutor) {
		Optional<Autor> autorOptional = autorRepository.findById(id);
		if (autorOptional.isPresent()) {
			Autor autorExistente = autorOptional.get();
			autorExistente.setNome(novoAutor.getNome());
			return autorRepository.save(autorExistente);
		} else {
			return null;
}
	}


		public List<Autor> buscarPorNome(String nome) {
			return autorRepository.buscarPorNome(nome);
		}
		
				
	

}