package com.deloitte.meupetshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deloitte.meupetshop.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}