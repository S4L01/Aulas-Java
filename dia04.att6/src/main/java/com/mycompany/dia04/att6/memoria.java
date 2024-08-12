/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia04.att6;

/**
 *
 * @author aluno.den
 */
public class memoria {
    private String marca;
    private String modelo;
    private String capacidade_armazenamento;

    public memoria(String marca, String modelo, String capacidade_armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade_armazenamento = capacidade_armazenamento;
    }

    public String getCapacidade_armazenamento() {
        return capacidade_armazenamento;
    }

    public void setCapacidade_armazenamento(String capacidade_armazenamento) {
        this.capacidade_armazenamento = capacidade_armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
