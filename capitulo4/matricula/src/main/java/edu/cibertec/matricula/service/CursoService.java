package edu.cibertec.matricula.service;

import edu.cibertec.matricula.dao.entity.CursoEntity;
import java.util.List;

public interface CursoService {

    public List<CursoEntity> listarTodos();

    public void insertar(CursoEntity ce);

    public void eliminar(int codigo);

}
