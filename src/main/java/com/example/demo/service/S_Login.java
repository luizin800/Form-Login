package com.example.demo.service;

import com.example.demo.Model.M_Usuario;
import com.example.demo.repository.R_Usuario;
import org.springframework.stereotype.Service;

@Service
public class S_Login {
    private static R_Usuario r_usuario;
    private S_Login(R_Usuario r_usuario) {
        this.r_usuario = r_usuario;
    }
    public static M_Usuario validaLogin(String usuario, String senha){
        return r_usuario.buscaUsuarioLogin(usuario,senha);
    }
}
