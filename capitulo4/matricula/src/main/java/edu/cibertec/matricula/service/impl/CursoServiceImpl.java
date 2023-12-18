package edu.cibertec.matricula.service.impl;

import edu.cibertec.matricula.dao.entity.CursoEntity;
import edu.cibertec.matricula.dao.repository.CursoRepositorio;
import edu.cibertec.matricula.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepositorio cursoRepositorio;

    @Override
    public List<CursoEntity> listarTodos() {
        return cursoRepositorio.findAll();
    }

    @Override
    public void insertar(CursoEntity ce) {
        cursoRepositorio.save(ce);
    }

    @Override
    public void eliminar(int codigo) {
        cursoRepositorio.deleteById(codigo);
    }

    
    
    

}
 