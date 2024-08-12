/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia04.attt5;

/**
 *
 * @author aluno.den
 */
public class funcionario {    
    private String codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private conta_bancaria contaBanco;

    public funcionario(String codigo, String nome, String endereco, String telefone, String email, conta_bancaria contaBanco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    public conta_bancaria getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(conta_bancaria contaBanco) {
        this.contaBanco = contaBanco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
