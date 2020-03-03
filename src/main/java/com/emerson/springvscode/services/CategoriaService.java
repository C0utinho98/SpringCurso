package com.emerson.springvscode.services;

import java.util.Optional;

import com.emerson.springvscode.domain.Categoria;
import com.emerson.springvscode.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CategoriaService
 */
@Service
public class CategoriaService {

  @Autowired
  private CategoriaRepository repo;

  public Categoria buscar(Integer id) {
    Optional<Categoria> obj = repo.findById(id);
    return obj.orElse(null);
  }
}