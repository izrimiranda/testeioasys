package com.teste.testeioasysapi.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_FILMES")
public class Filme {

	private Long id;

	private String nome;
	private String diretor;
	private String genero;
	private String atores;
	private boolean exclusao;
	private Voto idVoto;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return this.id;
	}

	@Column(name = "ATORES")
	public String getAtores() {
		return this.atores;
	}

	@Column(name = "DIRETOR")
	public String getDiretor() {
		return this.diretor;
	}

	@Column(name = "GENERO")
	public String getGenero() {
		return this.genero;
	}

	@OneToMany
	public Voto getIdVoto() {
		if (this.idVoto == null) {
			this.idVoto = new Voto();
		}
		return this.idVoto;
	}

	@Column(name = "NOME")
	public String getNome() {
		return this.nome;
	}

	@Column(name = "EXCLUSAO")
	public boolean isExclusao() {
		return this.exclusao;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public void setExclusao(boolean exclusao) {
		this.exclusao = exclusao;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdVoto(Voto idVoto) {
		this.idVoto = idVoto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
