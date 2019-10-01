package com.cobranca.apicob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cobranca.apicob.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	Empresa finById(long id);
}
