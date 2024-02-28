package com.onceonce1;

import com.onceonce1.Controller.UsuarioController;
import com.onceonce1.Entity.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*
		UsuarioController userControl = new UsuarioController();
		//crear un nuevo usuario
		Usuario usuario1 = new Usuario(6,"John Doe", new Date(91, 5, 6), "johndoe", "password123", "123456789", "johndoe@example.com", "New York");

		//guardar en la bas de datos
		userControl.CrearUsuario(usuario1);

		//crear una lista de usuarios para agregar
		List<Usuario> listaUsuarios = new List<Usuario>();
		*/
	}

}
