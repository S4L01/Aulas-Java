/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Principal;

/**
 *
 * @author aluno.den
 */
public class cliente {
   private String nome;
   private int idade;
   
   //construtor

    public cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
   

   // metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   
   
    
}
