package com.cobranca.apicob.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="TB_Cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID= 1L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_Cli;
	
	private int CPF;
	
	private String nome;

	public long getId_Cli() {
		return id_Cli;
	}

	public void setId_Cli(long id_Cli) {
		this.id_Cli = id_Cli;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
