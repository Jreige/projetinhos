package com.cobranca.apicob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cobranca.apicob.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Cliente findById(long id);
}
