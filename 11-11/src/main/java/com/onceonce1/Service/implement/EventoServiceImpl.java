package com.onceonce1.Service.implement;

import com.onceonce1.Entity.Evento;
import com.onceonce1.Repository.EventoRepo;
import com.onceonce1.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepo repoEv;

    @Override
    public List<Evento> ConsultarEvento() {
        return (List<Evento>) this.repoEv.findAll();
    }

    @Override
    public Evento CrearEvento(Evento event) {
        event.setNombre(event.getNombre());
        event.setCiudad(event.getCiudad());
        event.setLugar(event.getLugar());
        event.setCosto(event.getCosto());
        event.setFecha(event.getFecha());
        event.setParticipantes(event.getParticipantes());
        event.setDescripcion(event.getDescripcion());
        event.setEstado(event.getEstado());
        return this.repoEv.save(event);
    }

    @Override
    public Evento ModificarEvento(Evento event) {
        return this.repoEv.save(event);
    }

    @Override
    public Evento BuscarEvento(int id) {
        return this.repoEv.findById(id).get();
    }

    @Override
    public void EliminarEvento(int id) {
        this.repoEv.deleteById(id);
    }
}
