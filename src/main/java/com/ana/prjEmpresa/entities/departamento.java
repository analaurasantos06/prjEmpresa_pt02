package com.ana.prjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departamento;
	
	private Long depcodigo;
	
	private Long depnome;
	  
}

  public Long getdepnome() {
	  return depnome;
  }
  
  public Long getdepcodigo() {
	return depcodigo;
  
  }
  
  
