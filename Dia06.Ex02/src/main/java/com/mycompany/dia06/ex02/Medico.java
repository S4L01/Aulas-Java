/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia06.ex02;

/**
 *
 * @author aluno.den
 */
public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String cpf, String rg, String salario) {
        super(nome, cpf, rg, salario);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nDados Medico:\n" + 
            "\nNome:"+super.nome+
            "\nCpf:"+super.cpf+
            "\nRg:"+super.rg+
            "\nSalario:"+super.salario+
            "CRM:" + crm ;
    }
    
    
    
}
