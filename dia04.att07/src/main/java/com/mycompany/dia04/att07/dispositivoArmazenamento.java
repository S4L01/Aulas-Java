/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia04.att07;

/**
 *
 * @author aluno.den
 */
public class dispositivoArmazenamento extends produto{
    private String capacidade_armazenamento;


    public dispositivoArmazenamento(String capacidade_armazenamento, String modelo, String marca) {
        super(modelo, marca);
        this.capacidade_armazenamento = capacidade_armazenamento;
    }

    public String getCapacidade_armazenamento() {
        return capacidade_armazenamento;
    }

    public void setCapacidade_armazenamento(String capacidade_armazenamento) {
        this.capacidade_armazenamento = capacidade_armazenamento;
    }
    
}
