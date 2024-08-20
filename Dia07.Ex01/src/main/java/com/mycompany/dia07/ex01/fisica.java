/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia07.ex01;

/**
 *
 * @author aluno.den
 */
public abstract class fisica extends pessoa{
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String data_nascimento;

    public fisica(Sexo sexo, EstadoCivil estadoCivil, String data_nascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.data_nascimento = data_nascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return  "\nSexo:" + sexo.getNome() +"/"+sexo.getCaracter()+
                 super.toString() +
                "\nEstado Civil:" + estadoCivil.getNome() + 
                "\nData de Nascimento:" + data_nascimento;
    }
    
    
}
