package com.emanuel.desafioMv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuel.desafioMv.Model.Empresa;
import com.emanuel.desafioMv.Repository.EmpresaRepository;


@Service
public class EmpresaService {
	@Autowired
	EmpresaRepository EmpresaRepository;
	
	public List<Empresa> findAll(){
		return EmpresaRepository.findAll();
	}
	public Empresa save(Empresa Empresa) {
		return EmpresaRepository.save(Empresa);
	}
	
	public Empresa findById(int id) {
		return EmpresaRepository.findById(id).get();
	}
	public void deleteById(int id) {
		EmpresaRepository.deleteById(id);
	}
	
	public Empresa update(Empresa Empresa) {

		return EmpresaRepository.save(Empresa);

    }

}
