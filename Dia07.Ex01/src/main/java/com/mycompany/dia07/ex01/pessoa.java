/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia07.ex01;

/**
 *
 * @author aluno.den
 */
public abstract class pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome:" + nome + 
                "\nTelfone:" + telefone +
                "\nEmail:" + email+
                "\nEndereço:"+endereco;
    }
    
    
}
