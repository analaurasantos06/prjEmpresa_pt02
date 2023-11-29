package com.ana.prjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String funcionarios;
	
	private String Empresa;


    public Long getId() {
    	return id;
    }
    public String getname() {
    	return funcionarios;
    }
    public String getEmpresa() {
    	return Empresa;
    }
    
    public void setId(Long id) {
		this.id = id;
	}
	



