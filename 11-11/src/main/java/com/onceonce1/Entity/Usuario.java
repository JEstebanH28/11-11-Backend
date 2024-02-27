package com.onceonce1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name="usuarios")
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "fecha_nacimiento")
    private Date nacimiento;

    @Column (name = "usuario")
    private String usuario;

    @Column (name = "contrasena")
    private String password;

    @Column (name = "celular")
    private String celular;

    @Column (name = "email")
    private String email;

    @Column (name = "ciudad")
    private String ciudad;

}
