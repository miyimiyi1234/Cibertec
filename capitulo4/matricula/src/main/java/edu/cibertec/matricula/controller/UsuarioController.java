package edu.cibertec.matricula.controller;

import edu.cibertec.matricula.dao.entity.UsuarioEntity;
import edu.cibertec.matricula.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/")
    public String loginMostrar(Model modelo) {
        log.debug("Ingresando al Login");
        return "login";
    }

    @RequestMapping("loginAccion")
    public ModelAndView loginAccion(UsuarioEntity usuarioValida) {
        ModelAndView mv = null;
        UsuarioEntity ue = usuarioService.validarLogin(usuarioValida);
        if (ue == null) {
            log.info("Error en el login");
            mv = new ModelAndView("login", "msgError", "Usuario y clave no existen.¡Vuelva a intentar!");
        } else {
            log.warn("Usuario ingresando a la aplicación " + ue.getUsuario());
            mv = new ModelAndView("principal", "usuario", ue);
        }
        return mv;
    }
}
