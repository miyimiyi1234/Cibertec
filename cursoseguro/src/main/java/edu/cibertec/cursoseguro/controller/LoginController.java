package edu.cibertec.cursoseguro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView mostrarLogin(@RequestParam(value = "error", required = false) boolean error) {
        return new ModelAndView("miLogin", "error", error);
    }
}
