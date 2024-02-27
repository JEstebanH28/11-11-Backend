package com.onceonce1.Service;

import com.onceonce1.Entity.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> ConsultarUsuario();
    public Usuario CrearUsuario(Usuario user);
    public Usuario ModificarUsuario(Usuario user);
    public Usuario BuscarUsuario(int id);
    public void EliminarUsuario(int id);
}
