package com.onceonce1.Controller;


import com.onceonce1.Entity.Preferencia;
import com.onceonce1.Service.implement.PreferenciaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-version1")

public class PreferenciaController {
    @Autowired
    private PreferenciaServiceImpl prefimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarPreferencia", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPreferencia() { //<?> Puede devolver cualquier tipo de objetos de datos
        List<Preferencia> preferenciaList = this.prefimpl.ConsultarPreferencia();
        return ResponseEntity.ok(preferenciaList);
    }

    @PostMapping("CrearPreferencia")
    public ResponseEntity<?> CrearPreferencia(@RequestBody Preferencia preferencia) {
        Preferencia preferenciaCrear = this.prefimpl.CrearPreferencia(preferencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(preferenciaCrear);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPreferencia", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPreferencia(@RequestBody Preferencia preferencia) {
        Preferencia preferenciaModificada = this.prefimpl.ModificarPreferencia(preferencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(preferenciaModificada);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPreferencia", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPreferencia(@PathVariable int id) {
        this.prefimpl.EliminarPreferencia(id);
        return ResponseEntity.ok().build(); //Se utiliza para construir y devolver una respuesta http 200
    }

    @GetMapping
    @RequestMapping(value = "BuscarPreferencia/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPreferencia(@PathVariable int id) {
        try {
            Preferencia preferencia = this.prefimpl.BuscarPreferencia(id);
            if(preferencia != null) {
                return ResponseEntity.ok(preferencia);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
