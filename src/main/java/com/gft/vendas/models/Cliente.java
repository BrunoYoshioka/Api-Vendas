package com.gft.vendas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String cpfcnpj;
	
	private String rgie;
	
	private String rsocial;
	
	private String cep;
	
	private String endereco;
	
	private String bairro;
	
	private String fone;
	
	private String celular;
	
	private String email;
	
	private String numero;
	
	private String cidade;
	
	private String estado;
	
	
	public Cliente(Integer id, String nome, String cpfcnpj, String rgie, String rsocial, String cep, String endereco,
			String bairro, String fone, String celular, String email, String numero, String cidade, String estado) {
		this.id = id;
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.rgie = rgie;
		this.rsocial = rsocial;
		this.cep = cep;
		this.endereco = endereco;
		this.bairro = bairro;
		this.fone = fone;
		this.celular = celular;
		this.email = email;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Cliente() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getRgie() {
		return rgie;
	}

	public void setRgie(String rgie) {
		this.rgie = rgie;
	}

	public String getRsocial() {
		return rsocial;
	}

	public void setRsocial(String rsocial) {
		this.rsocial = rsocial;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
