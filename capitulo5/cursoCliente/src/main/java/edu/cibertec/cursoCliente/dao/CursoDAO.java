package edu.cibertec.cursoCliente.dao;

import edu.cibertec.cursoCliente.dto.CursoDTO;
import java.util.List;

public interface CursoDAO {

    public List<CursoDTO> listarTodos();

    public CursoDTO obtenerUno(int codigo);

    public void insertar(CursoDTO ce);

    public void modificar(CursoDTO ce);

    public void eliminar(int codigo);
}
