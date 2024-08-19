/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia06.ex02;

/**
 *
 * @author aluno.den
 */
public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String nome, String cpf, String rg, String salario) {
        super(nome, cpf, rg, salario);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\nDados Motoboy\n" +
            "\nNome:"+super.nome+
            "\nCpf:"+super.cpf+
            "\nRg:"+super.rg+
            "\nSalario:"+super.salario+                
            "CNG:" + cnh ;
    }

    }
    

    

