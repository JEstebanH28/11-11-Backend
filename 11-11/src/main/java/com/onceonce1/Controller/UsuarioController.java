package com.onceonce1.Controller;

import com.onceonce1.Entity.Usuario;
import com.onceonce1.Service.implement.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-version1")
public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl userimpl;

    @GetMapping
    @RequestMapping(value = "ConsultarUsuario", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarUsuario() { //<?> Puede devolver cualquier tipo de objetos de datos
        List<Usuario> usuarioList = this.userimpl.ConsultarUsuario();
        return ResponseEntity.ok(usuarioList);
    }

    @PostMapping("CrearUsuario")
    public ResponseEntity<?> CrearUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioCrear = this.userimpl.CrearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCrear);
    }

    @PutMapping
    @RequestMapping(value = "ModificarUsuario", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioModificado = this.userimpl.ModificarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioModificado);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarUsuario", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarUsuario(@PathVariable int id) {
        this.userimpl.EliminarUsuario(id);
        return ResponseEntity.ok().build(); //Se utiliza para cntruir y devolver una respuesta http 200
    }

    @GetMapping
    @RequestMapping(value = "BuscarUsuario/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarUsuario(@PathVariable int id) {
        try {
            Usuario usuario = this.userimpl.BuscarUsuario(id);
            if(usuario != null) {
                return ResponseEntity.ok(usuario);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
