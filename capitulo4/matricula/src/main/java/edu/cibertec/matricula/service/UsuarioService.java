package edu.cibertec.matricula.service;

import edu.cibertec.matricula.dao.entity.UsuarioEntity;

public interface UsuarioService {

    public UsuarioEntity validarLogin(UsuarioEntity usuario);
}
