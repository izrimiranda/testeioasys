package com.teste.testeioasysapi.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_DIZIMO")
public class Usuario {

	private Long id;
	private int tipoUsuario;
	private String nomeUsuario;
	private boolean exclusao;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return this.id;
	}

	@Column(name = "NOME_USUARIO")
	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	@Column(name = "TIPO_USUARIO")
	public int getTipoUsuario() {
		return this.tipoUsuario;
	}

	@Column(name = "EXCLUSAO")
	public boolean isExclusao() {
		return this.exclusao;
	}

	public void setExclusao(boolean exclusao) {
		this.exclusao = exclusao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	/**
	 * 1 para usuário adminstrador | 2 para usuário comum
	 *
	 * @param tipoUsuario
	 */
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
