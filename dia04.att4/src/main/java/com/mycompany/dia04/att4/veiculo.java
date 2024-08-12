/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia04.att4;

/**
 *
 * @author aluno.den
 */
public class veiculo {
    String placa;
    private String cor;
    private int numero_passageiros;
    private double cap_tanque;
    private double velocidade_max;
    private double consumo_medio;

    public veiculo(String placa, String cor, int numero_passageiros, double cap_tanque, double velocidade_max, double consumo_medio) {
        this.placa = placa;
        this.cor = cor;
        this.numero_passageiros = numero_passageiros;
        this.cap_tanque = cap_tanque;
        this.velocidade_max = velocidade_max;
        this.consumo_medio = consumo_medio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero_passageiros() {
        return numero_passageiros;
    }

    public void setNumero_passageiros(int numero_passageiros) {
        this.numero_passageiros = numero_passageiros;
    }

    public double getCap_tanque() {
        return cap_tanque;
    }

    public void setCap_tanque(double cap_tanque) {
        this.cap_tanque = cap_tanque;
    }

    public double getVelocidade_max() {
        return velocidade_max;
    }

    public void setVelocidade_max(double velocidade_max) {
        this.velocidade_max = velocidade_max;
    }

    public double getConsumo_medio() {
        return consumo_medio;
    }

    public void setConsumo_medio(double consumo_medio) {
        this.consumo_medio = consumo_medio;
    }
    
    
}
