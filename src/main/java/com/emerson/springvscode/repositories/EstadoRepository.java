package com.emerson.springvscode.repositories;

import com.emerson.springvscode.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EstadoRepository
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}