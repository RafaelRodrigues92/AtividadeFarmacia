package com.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos") 
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	
	@NotBlank(message = "O atributo nome é obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no mÃ­nimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo descrição é obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 10, max = 5000, message = "O atributo descrição deve conter no mÃ­nimo 05 e no máximo 100 caracteres")
	private String descricao;
	
	@NotNull
	private Long quantidade;
	
	@NotBlank(message = "O atributo console é obrigatório e não pode utilizar espaços em branco!") 
	@Size(min = 5, max = 100, message = "O atributo console deve conter no mÃ­nimo 05 e no máximo 100 caracteres")
	private String laboratorio;
	
	@NotNull
	private BigDecimal preco;
	
	@Size(min = 5, max = 1000, message = "O atributo midia deve conter no min 5")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}

