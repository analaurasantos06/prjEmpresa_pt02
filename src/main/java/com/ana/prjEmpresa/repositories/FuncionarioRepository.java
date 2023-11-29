package com.ana.prjEmpresa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FuncionarioRepository JpaRepository<Funcionario, Long>{ 
	@Query("SELECT f FROM Funcionario f WHERE LOWER(f.funnome) LIKE LOWER(CONCAT('%', :funnome, '%'))")
	List<Funcionario> findByNomeContaining(@Param("funnome") String funnome);

}
