package com.curso.cursoudm.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursoudm.domain.Categoria;
import com.curso.cursoudm.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //instancia automaticamente
	public CategoriaRepository repo;

	public Categoria find(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);//metodo do repositorio JPA herdado na interface CategoriaRepository
		return obj.orElse(null);
		} 

}
