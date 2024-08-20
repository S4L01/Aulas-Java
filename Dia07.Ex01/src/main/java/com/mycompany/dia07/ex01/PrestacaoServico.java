/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia07.ex01;

/**
 *
 * @author aluno.den
 */
public class PrestacaoServico extends Juridica{
   private String contraro_inicio;
   private String contraro_fim;

    public PrestacaoServico(String contraro_inicio, String contraro_fim, String cnpj, String inscricao_estadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricao_estadual, nome, telefone, email, endereco);
        this.contraro_inicio = contraro_inicio;
        this.contraro_fim = contraro_fim;
    }

    public String getContraro_inicio() {
        return contraro_inicio;
    }

    public void setContraro_inicio(String contraro_inicio) {
        this.contraro_inicio = contraro_inicio;
    }

    public String getContraro_fim() {
        return contraro_fim;
    }

    public void setContraro_fim(String contraro_fim) {
        this.contraro_fim = contraro_fim;
    }

    @Override
    public String toString() {
        return  
                super.toString()+
                "\nContrato Inicio:" + contraro_inicio + 
                "\nContrato Fim:" + contraro_fim;
    }

    
  
    
}
