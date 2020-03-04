package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PagamentoRepository
 */
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}