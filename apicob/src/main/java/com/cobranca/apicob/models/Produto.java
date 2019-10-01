package com.cobranca.apicob.models;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="TB_Produto")
public class Produto implements Serializable {
	private static final long serialVersionUID= 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_Prod;
	
	private String descricao;
	
	private double valor;

	public long getId_Prod() {
		return id_Prod;
	}

	public void setId_Prod(long id_Prod) {
		this.id_Prod = id_Prod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
