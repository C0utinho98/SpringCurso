package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ItemPedidoRepository
 */
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}