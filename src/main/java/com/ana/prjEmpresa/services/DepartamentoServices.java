package com.ana.prjEmpresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ana.prjEmpresa.entities.departamento;
import com.ana.prjEmpresa.repositories.DepartamentoRepository;


@Service
public class DepartamentoServices {
	
	private final DepartamentoRepository departamentoRepository;
	
	public DepartamentoService(departamentoRepository departamentoRepository) {
		this.DepartamentoRepository = departamentoRepository;
	
	
	}
    
	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	}

public Departamento getDepartamentoById(Long Id) {
	return departamentoRepository.findById(Id).orElse(null);
}
}

public List<Departamento> getAllDepartamento() {
	return departamentoRepository.findAll();
}
}

public void deleteDepartamento(Long id) {
	departamentoRepository.deleteById(id);
}
}

public Departamento updateJogo(Long id, Departamento novoDepartamento) {
	Optional<Departamento> departamentoOptional = departamentoRepository.findyById(id);
	if (departamentoOptional.isPresent()) {
		departamento departamentoExistente = departamentoOptional.get();
		departamentoExistente.setName(novoDepartamento.getName());
		departamentoExistente.setPlataform(novoDepartamento.getPlataform());
		return departamentoRepository.save(departamentoExistente);
	}
	} else {
		return null;
	}
	











