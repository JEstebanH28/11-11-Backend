package com.onceonce1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name="eventos")
@AllArgsConstructor
@NoArgsConstructor

public class Evento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "ciudad")
    private String ciudad;

    @Column (name = "lugar")
    private String lugar;

    @Column (name = "costo")
    private Double costo;

    @Column (name = "fecha")
    private Date fecha;

    @Column (name = "no_participantes")
    private int participantes;

    @Column (name = "descripcion")
    private String descripcion;

    @Column (name = "estado")
    private String estado;
}
