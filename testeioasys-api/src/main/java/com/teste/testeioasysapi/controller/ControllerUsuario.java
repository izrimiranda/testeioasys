package com.teste.testeioasysapi.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.teste.testeioasysapi.model.entity.Usuario;
import com.teste.testeioasysapi.repository.UsuarioRepository;

@RestController
public class ControllerUsuario {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void cadastrarUsuario() {
		this.montarUsuario();
	}

	private Usuario montarUsuario() {
		final Usuario usuario = new Usuario();
		final Scanner scanner = new Scanner(System.in);
		String nome = "";
		final int tipo;

		System.out.println("Insira no nome do Usuário: ");
		nome = scanner.next();
		usuario.setNomeUsuario(nome);
		System.out.println("Insira o tipo do Usuário: 1 - Administrador | 2 - Usuário Comum");
		tipo = scanner.nextInt();
		usuario.setTipoUsuario(tipo);

		return usuario;
	}
}
