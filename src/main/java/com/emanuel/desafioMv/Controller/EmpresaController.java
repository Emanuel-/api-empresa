package com.emanuel.desafioMv.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.emanuel.desafioMv.Model.Empresa;
import com.emanuel.desafioMv.Service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	EmpresaService empresaService;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Empresa> findAll() {
		return empresaService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa save(@RequestBody Empresa empresa) {
		return empresaService.save(empresa);
	}
	@GetMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Empresa findById(@RequestBody int id) {
		return empresaService.findById(id);
	}

	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@RequestBody int id) {
		empresaService.deleteById(id);
	}
	
	@PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Empresa atualizar(@PathVariable int id, @RequestBody Empresa empresa) {
        Empresa empresaAtual = empresaService.findById(id);
        return empresaService.update(empresaAtual);

    }
	
}