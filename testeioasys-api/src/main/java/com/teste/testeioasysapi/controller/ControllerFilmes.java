package com.teste.testeioasysapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.teste.testeioasysapi.repository.FilmeRepository;

@RestController
public class ControllerFilmes {

	@Autowired
	private FilmeRepository filmesRepository;
}
