package com.emanuel.desafioMv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emanuel.desafioMv.Model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
	

}
