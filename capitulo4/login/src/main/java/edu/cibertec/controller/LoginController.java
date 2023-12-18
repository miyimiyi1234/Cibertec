package edu.cibertec.login.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String ingresarLogin() {
        return "login";
    }

    @Value("${bienvenida.mensaje:No hay mensaje}")
    private String mensajeBienvenida;

    @RequestMapping("login")
    public ModelAndView validarLogin(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String usuario = request.getParameter("txtUsuario");
        String clave = request.getParameter("txtClave");

        if (usuario.equalsIgnoreCase("user") && clave.equals("12345")) {
            mv.addObject("mensaje", mensajeBienvenida);
            mv.setViewName("principal");
        } else {
            mv.addObject("error", "Credenciales mal ingresadas");
            mv.setViewName("login");
        }
        return mv;
    }
}
