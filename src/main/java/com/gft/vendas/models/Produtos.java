package com.gft.vendas.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produtos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	private Float valorPagto;
	private Float valorVenda;
	private Integer qtde;
	private LocalDateTime dataCadastro = LocalDateTime.now();
	@ManyToOne
	private String idUnidadeMedida;
	@ManyToOne
	private String idSubCategoria;
	@ManyToOne
	private String idCategoria;
	
	
	public Produtos(Integer id, String nome, String descricao, Float valorPagto, Float valorVenda, Integer qtde,
			LocalDateTime dataCadastro, String idUnidadeMedida, String idSubCategoria, String idCategoria) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valorPagto = valorPagto;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
		this.dataCadastro = dataCadastro;
		this.idUnidadeMedida = idUnidadeMedida;
		this.idSubCategoria = idSubCategoria;
		this.idCategoria = idCategoria;
	}
	
	
	public Produtos() {
		
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getValorPagto() {
		return valorPagto;
	}
	public void setValorPagto(Float valorPagto) {
		this.valorPagto = valorPagto;
	}
	public Float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Integer getQtde() {
		return qtde;
	}
	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getIdUnidadeMedida() {
		return idUnidadeMedida;
	}
	public void setIdUnidadeMedida(String idUnidadeMedida) {
		this.idUnidadeMedida = idUnidadeMedida;
	}
	public String getIdSubCategoria() {
		return idSubCategoria;
	}
	public void setIdSubCategoria(String idSubCategoria) {
		this.idSubCategoria = idSubCategoria;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	
}
