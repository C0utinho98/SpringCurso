package com.emerson.springvscode.services;

import java.util.Optional;

import com.emerson.springvscode.domain.Pedido;
import com.emerson.springvscode.repositories.PedidoRepository;
import com.emerson.springvscode.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PedidoService
 */
@Service
public class PedidoService {

  @Autowired
  private PedidoRepository repo;

  public Pedido find(Integer id) {
    Optional<Pedido> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Tipo " + Pedido.class.getName()));
  }
}