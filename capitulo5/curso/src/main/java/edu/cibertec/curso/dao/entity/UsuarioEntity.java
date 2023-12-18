package edu.cibertec.curso.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioEntity extends RepresentationModel<UsuarioEntity> {

    @Id
    private String usuario;
    private String clave;
    @Column(name = "nomcompleto")
    private String nombreCompleto;
    private byte[] foto;
}
