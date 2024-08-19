/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia06.ex01;

/**
 *
 * @author aluno.den
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricao_estadual;

    public Juridica(String cnpj, String inscricao_estadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nDados Pessoa Juridica:" +
                "\nNome:"+super.nome+
                "\nTelefone:"+super.telefone+
                "\nCNPJ:" + cnpj + 
                "\nInscirção Estadual:" + inscricao_estadual;    
    }



}
