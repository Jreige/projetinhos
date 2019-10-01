package com.cobranca.apicob.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobranca.apicob.models.Produto;
import com.cobranca.apicob.repository.ProdutoRepository;


@RestController
@RequestMapping(value="/api")
public class ProdutoResources {

	@Autowired
	ProdutoRepository PR;
	
	@GetMapping("/produtos")
	public List<Produto> listaprodutos(){
		return PR.findAll();
	}
	
	@GetMapping("/prosdutos/{id}")
	public Produto listaUmProduto(@PathVariable(value="id") long id){
		return PR.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody Produto prd){
		return PR.save(prd);
		
	}
	
}
