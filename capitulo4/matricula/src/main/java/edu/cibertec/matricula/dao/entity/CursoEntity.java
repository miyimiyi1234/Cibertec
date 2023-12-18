package edu.cibertec.matricula.dao.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "curso") 
@Data
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcurso")
    @NotNull
    private int idCurso;
    @NotNull
    @NotBlank(message = "Curso es obligatorio")
    @Size(min = 3, max = 40)
    @Column(name = "nomcurso")
    private String nomCurso;
    @DateTimeFormat(pattern = "yyyy-MM-dd") //Solo para validación
    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "fechainicio")
    private Date fechaInicio;
    @NotNull(message = "{curso.alumnosmin.vacio}")
    @Min(value = 1, message = "{curso.alumnosmin.vacio}")
    @Column(name = "alumnosmin")
    private int alumnosMin;
    @Column(name = "alumnosact")
    private int alumnosAct;
    private int estado;

}
