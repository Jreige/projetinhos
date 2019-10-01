package com.cobranca.apicob.models;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="TB_Empresa")
public class Empresa implements Serializable {
	private static final long serialVersionUID= 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_Emp;
	
	private String nomeFant;
	
	private String razaoSocial;
	
	private String CNPJ;

	public long getId_Emp() {
		return id_Emp;
	}

	public void setId_Emp(long id_Emp) {
		this.id_Emp = id_Emp;
	}

	public String getNomeFant() {
		return nomeFant;
	}

	public void setNomeFant(String nomeFant) {
		this.nomeFant = nomeFant;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	
	
	
}
	