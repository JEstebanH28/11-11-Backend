package com.onceonce1.Repository;

import com.onceonce1.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository <Usuario, Integer> {
}
