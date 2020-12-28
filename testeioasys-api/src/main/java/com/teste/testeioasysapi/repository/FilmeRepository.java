package com.teste.testeioasysapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.teste.testeioasysapi.model.entity.Filme;

@RepositoryRestResource(collectionResourceRel = "filme", path = "filmes")
public interface FilmeRepository extends PagingAndSortingRepository<Filme, Long> {

	
}
