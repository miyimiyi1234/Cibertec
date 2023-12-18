package edu.cibertec.cursoCliente.service.impl;

import edu.cibertec.cursoCliente.dao.CursoDAO;
import edu.cibertec.cursoCliente.dto.CursoDTO;
import edu.cibertec.cursoCliente.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoDAO cursoDAO;

    @Override
    public List<CursoDTO> listarTodos() {
        return cursoDAO.listarTodos();
    }

    @Override
    public CursoDTO obtenerUno(int codigo) {
        return cursoDAO.obtenerUno(codigo);
    }

    @Override
    public void insertar(CursoDTO ce) {
        cursoDAO.insertar(ce);
    }

    @Override
    public void modificar(CursoDTO ce) {
        cursoDAO.modificar(ce);
    }

    @Override
    public void eliminar(int codigo) {
        cursoDAO.eliminar(codigo);
    }

}
