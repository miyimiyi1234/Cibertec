package edu.cibertec.cursoCliente.dto;

import java.sql.Date;
import lombok.Data;

@Data
public class CursoDTO {

    private Integer idcurso;
    private String nomcurso;
    private Date fechainicio;
    private Integer alumnosmin;
    private Integer alumnosact;
    private Integer estado;
}
