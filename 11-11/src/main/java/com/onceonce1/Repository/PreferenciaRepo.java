package com.onceonce1.Repository;

import com.onceonce1.Entity.Preferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenciaRepo extends JpaRepository <Preferencia, Integer> {
}
