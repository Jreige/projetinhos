package com.cobranca.apicob.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobranca.apicob.models.Cliente;
import com.cobranca.apicob.repository.ClienteRepository;

@RestController
@RequestMapping(value="/api")
public class ClienteResouces {
	
	@Autowired
	ClienteRepository CR;
	
	@GetMapping("/clientes")
	public List<Cliente> listaclientes(){
		return CR.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente listaUmCliente(@PathVariable(value="id") long id){
	return CR.findById(id);
	}
	
	@PostMapping("/cliente")
	public Cliente salvaCliente(@RequestBody Cliente cli){
		return CR.save(cli);
	}
	
}