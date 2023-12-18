package edu.cibertec.curso.controller;

import edu.cibertec.curso.dao.entity.CursoEntity;
import edu.cibertec.curso.dto.ErrorDTO;
import edu.cibertec.curso.service.CursoService;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
@Slf4j

public class CursoController {

    @Autowired
    private CursoService cursoService;
    
    @Value("${server.port}")
    private String puertoUsado;
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity manejarExcepciones() {
        ErrorDTO err = new ErrorDTO(HttpStatus.CONFLICT.toString(), "Problema interno", "Ha ocurrido un error en la aplicacion. Verifique su request!");
        return ResponseEntity.status(HttpStatus.CONFLICT).body(err);
    }

    @GetMapping("/cursos")
    @ResponseStatus(HttpStatus.CREATED)
    public List<CursoEntity> listarTodos() {
        return cursoService.listarTodos();
    }

    @GetMapping("/cursos/{id}")
    public CursoEntity obtenerUno(@PathVariable(value = "id") int codigo) {
        try {
            log.info("instancia desde donde se ha usado = "+puertoUsado);
            CursoEntity rpta = cursoService.obtenerUno(codigo);
            rpta.add(linkTo(methodOn(CursoController.class).obtenerUno(codigo)).withSelfRel());
            //rpta.add(linkTo(methodOn(MatriculaController.class).listarAlumnosInscritos(codigo)).withRel("alumnos"));
            return rpta;
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Curso no localizado", e);
        }
    }

    @PostMapping("/cursos")
    public void insertar(@RequestBody CursoEntity ce) {
        try {
            cursoService.insertar(ce);
        } catch (DataIntegrityViolationException e) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Curso no puede ser creado", null);
        }
    }

    @PutMapping("/cursos/{id}")
    public void modificar(@RequestBody CursoEntity ce, @PathVariable(value = "id") int codigo) {
        ce.setIdcurso(codigo);
        cursoService.modificar(ce);
    }

    @DeleteMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable(value = "id") int codigo) {
        cursoService.eliminar(codigo);
    }
}
