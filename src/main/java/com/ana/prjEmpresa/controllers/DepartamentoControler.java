package com.ana.prjEmpresa.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ana.prjEmpresa.entities.departamento;
import com.senai.analaura.prjGame.entities.Jogo;


@RestController
@RequestMapping("/departamento")
public class DepartamentoControler {
	private final DepartamentoService departamentoService;

}
public DepartamentoControler(DepartamentoService departamentoService) {
	this.departamentoService = DepartamentoService;
}

@PostMapping
public Departamento createDepartamento(@RequestMapping departamento Departamento) {
	return.departamentoService.savedepartamento(departamento);
}

public ResponseEntity<departamento> getDepartamento(@PathVariable Long id) {
	Departamento departamento = DepartamentoService.getDepartamentoById(id);
	if (departamento != null) {
		return ResponseEntity.ok(departamento);
	} else {
		return ResponseEntity.notFound().build();

	}
}
}
@DeleteMapping("/{id}")
public void deleteDepartamento(@PathVariable Long id) {
	departamentoService.deleteDepartamento(id);
}

@GetMapping
public ResponseEntity<List<Departamento>> getAllDepartamentos(RequestEntity<Void> requestEntity) {
	String method = requestEntity.getMethod().name();
	String contentType = requestEntity.getHeaders().getContentType().toString();
	List<Departamento> jogos = departamentoService.getAllDepartamento();
	return ResponseEntity.status(HttpStatus.OK).header("Method", method).header("Content-Type", contentType)
			.body(departamentos);
}
}

@PutMapping("/{id}")
public Departamento updateDepartamento(@PathVariable Long id, @RequestBody Departamento departamento) {
	return departamentoService.updateDepartamento(id, departamento);
}
}




