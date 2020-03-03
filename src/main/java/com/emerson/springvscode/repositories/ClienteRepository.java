package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ClienteRepository
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}