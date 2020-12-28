package com.teste.testeioasysapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.teste.testeioasysapi.controller.ControllerUsuario;

@SpringBootApplication
public class TesteioasysApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteioasysApiApplication.class, args);
		new ControllerUsuario().cadastrarUsuario();
	}

}
