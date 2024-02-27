package com.onceonce1.Service.implement;

import com.onceonce1.Entity.Preferencia;
import com.onceonce1.Entity.Usuario;
import com.onceonce1.Repository.PreferenciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenciaServiceImpl implements com.onceonce1.Service.implement.PreferenciaService {
    @Autowired
    private PreferenciaRepo repoPref;
    @Override
    public List<Preferencia> ConsultarPreferencia() {
        return (List<Preferencia>) this.repoPref.findAll();
    }

    @Override
    public Preferencia CrearPreferencia(Preferencia pref) {
        pref.setNombre(pref.getNombre());
        pref.setCategoria(pref.getCategoria());
        return this.repoPref.save(pref);
    }

    @Override
    public Preferencia ModificarPreferencia(Preferencia pref) {
        return this.repoPref.save(pref);
    }

    @Override
    public Preferencia BuscarPreferencia(int id) {
        return this.repoPref.findById(id).get();
    }

    @Override
    public void EliminarPreferencia(int id) {
        this.repoPref.deleteById(id);
    }
}
