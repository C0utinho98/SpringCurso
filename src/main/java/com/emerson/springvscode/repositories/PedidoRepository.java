package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PedidoRepository
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}