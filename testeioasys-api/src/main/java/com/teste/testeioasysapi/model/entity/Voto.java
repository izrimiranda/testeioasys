package com.teste.testeioasysapi.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_VOTO")
public class Voto {

	private Long id;
	private Usuario idUsuario;
	private int quantidadeEstrelas;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return this.id;
	}

	@Column(name = "ID_USUARIO")
	@ManyToOne
	public Usuario getIdUsuario() {
		if (this.idUsuario == null) {
			this.idUsuario = new Usuario();
		}
		return this.idUsuario;
	}

	@Column(name = "QUANTIDADE_ESTRELAS")
	public int getQuantidadeEstrelas() {
		return this.quantidadeEstrelas;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setQuantidadeEstrelas(int quantidadeEstrelas) {
		this.quantidadeEstrelas = quantidadeEstrelas;
	}

}
