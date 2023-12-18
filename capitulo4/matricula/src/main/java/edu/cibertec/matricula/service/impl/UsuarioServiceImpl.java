package edu.cibertec.matricula.service.impl;

import edu.cibertec.matricula.dao.entity.UsuarioEntity;
import edu.cibertec.matricula.dao.repository.UsuarioRepositorio;
import edu.cibertec.matricula.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public UsuarioEntity validarLogin(UsuarioEntity usuario) {
        UsuarioEntity rpta
                = usuarioRepositorio.findByUsuarioAndClave(usuario.getUsuario(),
                        usuario.getClave());
        return rpta;
    }
}
