package com.onceonce1.Service.implement;

import com.onceonce1.Entity.Usuario;
import com.onceonce1.Repository.UsuarioRepo;
import com.onceonce1.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepo repo;

    @Override
    public List<Usuario> ConsultarUsuario() {
        //porque dejar List<Usuario>, no es redundante? - mirar despues.
        return (List<Usuario>) this.repo.findAll();
    }

    @Override
    public Usuario CrearUsuario(Usuario user) {
        user.setNombre(user.getNombre());
        user.setNacimiento(user.getNacimiento());
        user.setUsuario(user.getUsuario());
        user.setPassword(user.getPassword());
        user.setCelular(user.getCelular());
        user.setEmail(user.getEmail());
        user.setCiudad(user.getCiudad());
        return this.repo.save(user);
    }

    @Override
    public Usuario ModificarUsuario(Usuario user) {
        //com actualizar cada atributo de la entidad Usuario?
        return this.repo.save(user);
    }

    @Override
    public Usuario BuscarUsuario(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarUsuario(int id) {
        this.repo.deleteById(id);
    }
}
