package edu.cibertec.matricula.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    private String usuario;
    private String clave;
    @Column(name = "nomcompleto")
    private String nombreCompleto;
    private byte[] foto;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public UsuarioEntity() {
    }

    public UsuarioEntity(String usuario, String clave, String nombreCompleto) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UsuarioEntity{usuario=").append(usuario);
        sb.append(", clave=").append(clave);
        sb.append(", nombreCompleto=").append(nombreCompleto);
        sb.append('}');
        return sb.toString();
    }
}
