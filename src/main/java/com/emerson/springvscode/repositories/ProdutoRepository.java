package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}