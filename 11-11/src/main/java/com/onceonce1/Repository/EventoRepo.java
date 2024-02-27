package com.onceonce1.Repository;

import com.onceonce1.Entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepo extends JpaRepository <Evento, Integer> {
}
