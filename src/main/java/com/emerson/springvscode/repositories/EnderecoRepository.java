package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EnderecoRepository
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}