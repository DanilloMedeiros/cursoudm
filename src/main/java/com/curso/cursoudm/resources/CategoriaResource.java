package com.curso.cursoudm.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.cursoudm.domain.Categoria;
import com.curso.cursoudm.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")//endpoint
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	@RequestMapping(value = "/{id}",method=RequestMethod.GET)//receber os dados atraves de um id
	public ResponseEntity<?> find(@PathVariable Integer id) {//o id passado na url vai para a variavel do metodo
		// ResEntity encapsula respostas HTTP; a ? significa que pode esperar qualquer tipo
		
		Categoria obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);// ok() pra dizer que ocorreu com sucesso e body() pra mostrar os dados em obj
	}
	
}
