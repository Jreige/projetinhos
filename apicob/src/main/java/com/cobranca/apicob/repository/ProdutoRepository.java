package com.cobranca.apicob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cobranca.apicob.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
}
