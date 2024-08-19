/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia06.ex02;

/**
 *
 * @author aluno.den
 */
public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, String salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nDados Engenheiro:\n" + 
                "\nNome:"+super.nome+
                "\nCpf:"+super.cpf+
                "\nRg:"+super.rg+
                "\nSalario:"+super.salario+
                "\nCrea::" + crea ;
    }
    
    
}
