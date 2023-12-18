/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.cibertec.rest;

import edu.cibertec.rest.dto.PersonaDTO;
import java.util.Calendar;
import java.util.Date;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */

@RestController
public class ServicioRestController {
    @RequestMapping(value = "/", produces = MediaType.APPLICATION_XML_VALUE)
    public PersonaDTO responder(){
        return new PersonaDTO(1, "Javier Sanchez", "12345678", new Date(Calendar.getInstance().getTimeInMillis()));
    }
}
