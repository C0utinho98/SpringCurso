package com.emerson.springvscode.services;

import java.util.Optional;

import com.emerson.springvscode.domain.Cliente;
import com.emerson.springvscode.repositories.ClienteRepository;
import com.emerson.springvscode.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClienteService
 */
@Service
public class ClienteService {

  @Autowired
  private ClienteRepository repo;

  public Cliente find(Integer id) {
    Optional<Cliente> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo " + Cliente.class.getName()));
  }
}