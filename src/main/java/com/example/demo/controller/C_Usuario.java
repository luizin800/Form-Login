package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Usuario {
    @GetMapping("/listar")
    public String getListaUsuario(){
        return "usuario/pv_listaUsuario";
    }
}
