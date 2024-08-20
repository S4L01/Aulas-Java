/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia07.ex01;

/**
 *
 * @author aluno.den
 */
public class Cliente extends fisica{
    String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, EstadoCivil estadoCivil, String data_nascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadoCivil, data_nascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return  
                super.toString()+
                "\nProtocolo Atendimento:" + protocoloAtendimento;
    }

    


    
    
}
