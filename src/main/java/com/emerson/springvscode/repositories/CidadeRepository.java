package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CidadeRepository
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}