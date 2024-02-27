package com.onceonce1.Service;

import com.onceonce1.Entity.Evento;

import java.util.List;

public interface EventoService {

    List<Evento> ConsultarEvento();
    public Evento CrearEvento(Evento event);
    public Evento ModificarEvento(Evento event);
    public Evento BuscarEvento(int id);
    public void EliminarEvento(int id);
}
