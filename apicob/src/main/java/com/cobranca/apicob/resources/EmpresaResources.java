package com.cobranca.apicob.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobranca.apicob.models.Empresa;
import com.cobranca.apicob.repository.EmpresaRepository;




@RestController
@RequestMapping(value="/api")
public class EmpresaResources {

	@Autowired
	EmpresaRepository ER;
	
	@GetMapping("/empresas")
	public List<Empresa> listaEmpresas(){
		return ER.findAll();
	}
	
	@GetMapping("/empresas/{id}")
	public Empresa listaUmEmpresa(@PathVariable(value="id") long id){
		return ER.finById(id);
	}
	
	@PostMapping("/empresa")
	public Empresa salvaEmpresa(@RequestBody Empresa emp){
		return ER.save(emp);	
	}
	
	 
}
