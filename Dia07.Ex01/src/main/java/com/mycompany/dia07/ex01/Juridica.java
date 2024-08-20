/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia07.ex01;

/**
 *
 * @author aluno.den
 */
public abstract class Juridica extends pessoa{
    protected String cnpj;
    protected String inscricao_estadual;

    public Juridica(String cnpj, String inscricao_estadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    @Override
    public String toString() {
        return  
                "\nCnpj:" + cnpj + 
                 super.toString() +
                "\nInscricao Estadual:" + inscricao_estadual;
    }


    
    
}
