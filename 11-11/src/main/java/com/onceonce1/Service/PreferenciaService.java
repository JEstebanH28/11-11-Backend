package com.onceonce1.Service.implement;

import com.onceonce1.Entity.Preferencia;

import java.util.List;

public interface PreferenciaService {

    public List<Preferencia> ConsultarPreferencia();
    public Preferencia CrearPreferencia(Preferencia pref);
    public Preferencia ModificarPreferencia(Preferencia pref);
    public Preferencia BuscarPreferencia(int id);
    public void EliminarPreferencia(int id);
}