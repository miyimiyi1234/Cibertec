package edu.cibertec.curso.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class ErrorDTO {

    private String status;
    private String error;
    private String message;
}
