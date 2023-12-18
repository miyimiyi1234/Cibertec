/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.rest.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Asus
 */

@Data
@AllArgsConstructor
public class PersonaDTO {
    
    private int codigo;
    private String nombre;
    private String nroDoc;
    private Date fechaNacimiento; 
}
