package com.emerson.springvscode.services;

import java.util.Optional;

import com.emerson.springvscode.domain.Categoria;
import com.emerson.springvscode.repositories.CategoriaRepository;
import com.emerson.springvscode.services.exceptions.ObjectNotFoundException;

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
    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo " + Categoria.class.getName()));
  }
}