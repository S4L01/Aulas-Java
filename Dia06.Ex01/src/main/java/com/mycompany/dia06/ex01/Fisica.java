/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia06.ex01;

/**
 *
 * @author aluno.den
 */
public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String data_nascimento;

    public Fisica(String cpf, String rg, String data_nascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.data_nascimento = data_nascimento;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Dados Pessoa Fisica \n" + 
                "\nNome:"+super.nome+
                "\nTelefone:"+super.telefone+
                "\nCpf:" + cpf + 
                ",\nRg:" + rg + 
                ",\nData Nascimento:" + data_nascimento ;
                
    }


    
    }
    
