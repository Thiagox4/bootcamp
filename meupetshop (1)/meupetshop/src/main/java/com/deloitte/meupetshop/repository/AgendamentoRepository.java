package com.deloitte.meupetshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deloitte.meupetshop.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}