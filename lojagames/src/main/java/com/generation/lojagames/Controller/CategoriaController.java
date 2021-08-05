package com.generation.lojagames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojagames.model.Categoria;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	private com.generation.lojagames.Repository.CategoriaRepository repository;

	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id) {

		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> getAllDescricao(@PathVariable String descricao) {

		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria) {

		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}

	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria) {

		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
