/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.dia07.ex01;

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino",'F');
    
    String nome;
    char caracter;

    private Sexo(String nome, char caracter) {
        this.nome = nome;
        this.caracter = caracter;
    }

    public String getNome() {
        return nome;
    }

    public char getCaracter() {
        return caracter;
    }
    
}
