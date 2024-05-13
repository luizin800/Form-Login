package com.example.demo.service;

import com.example.demo.Model.M_Aluno;

import com.example.demo.repository.R_Aluno;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class S_Aluno {
    private static R_Aluno r_aluno;
    public S_Aluno(R_Aluno r_aluno){
        this.r_aluno = r_aluno;
    }
    public static M_Aluno cadastrarAluno(String nome, String email, String dataNasc){
        M_Aluno aluno = new M_Aluno();
        aluno.setNome(nome);
        aluno.setEmail(email);

        try{
            aluno.setDataNascimento(LocalDate.parse(dataNasc));
            aluno = r_aluno.save(aluno);
            return aluno;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
