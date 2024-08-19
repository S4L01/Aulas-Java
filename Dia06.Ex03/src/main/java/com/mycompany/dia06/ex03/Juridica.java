/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia06.ex03;

/**
 *
 * @author aluno.den
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricao_estadual;
    private String data_inicio;
    private String data_termino;
    private String valor_contrato;

    public Juridica(String cnpj, String inscricao_estadual, String data_inicio, String data_termino, String valor_contrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricao_estadual = inscricao_estadual;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.valor_contrato = valor_contrato;
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

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_termino() {
        return data_termino;
    }

    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }

    public String getValor_contrato() {
        return valor_contrato;
    }

    public void setValor_contrato(String valor_contrato) {
        this.valor_contrato = valor_contrato;
    }


    @Override
    public String toString() {
        return "\nPessoa Juridica:\n" + 
                super.toString()+
                "\ncnpj=" + cnpj + 
                "\nInscricao estadual:" + inscricao_estadual + 
                "\nData do inicio:" + data_inicio + 
                "\nData do termino:" + data_termino + 
                "\nValor do contrato:" + valor_contrato;
    }
    
    
}
