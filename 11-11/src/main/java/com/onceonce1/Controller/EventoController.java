package com.onceonce1.Controller;

import com.onceonce1.Entity.Evento;
import com.onceonce1.Service.implement.EventoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-version1")

public class EventoController {
    @Autowired
    private EventoServiceImpl eventimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarEvento", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEvento() { //<?> Puede devolver cualquier tipo de objetos de datos
        List<Evento> eventoList = this.eventimpl.ConsultarEvento();
        return ResponseEntity.ok(eventoList);
    }

    @PostMapping("CrearEvento")
    public ResponseEntity<?> CrearEvento(@RequestBody Evento evento) {
        Evento eventoCrear = this.eventimpl.CrearEvento(evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventoCrear);
    }

    @PutMapping
    @RequestMapping(value = "ModificarEvento", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEvento(@RequestBody Evento evento) {
        Evento eventoModificado = this.eventimpl.ModificarEvento(evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventoModificado);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarEvento", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEvento(@PathVariable int id) {
        this.eventimpl.EliminarEvento(id);
        return ResponseEntity.ok().build(); //Se utiliza para cntruir y devolver una respuesta http 200
    }

    @GetMapping
    @RequestMapping(value = "BuscarEvento/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEvento(@PathVariable int id) {
        try {
            Evento evento = this.eventimpl.BuscarEvento(id);
            if(evento != null) {
                return ResponseEntity.ok(evento);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
