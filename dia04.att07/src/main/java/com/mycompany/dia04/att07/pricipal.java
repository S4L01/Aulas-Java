/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia04.att07;

/**
 *
 * @author aluno.den
 */
public class pricipal {

    public static void main(String[] args) {
        Processador processador = new Processador("2.0", "integrado", "intel");
        dispositivoArmazenamento dados_armazenamento = new dispositivoArmazenamento("128", "ssd", "intel");
        memoria dados_memoria = new memoria("16", "3.0", "sla", "kings");
        placaMae dados_plcamae = new placaMae("5", "sla", "razen");
        
        
        System.out.println("Dados processador");
        System.out.println("Frequencia:"+processador.getFrequencia());
        System.out.println("Modelo:"+processador.getModelo());
        System.out.println("Marca:"+processador.getMarca());

        System.out.println("Dados Armazenamento");
        System.out.println("Capcidade:"+dados_armazenamento.getCapacidade_armazenamento());
        System.out.println("Modelo:"+dados_armazenamento.getModelo());
        System.out.println("Marca:"+dados_armazenamento.getMarca());

        System.out.println("Dados memoria");
        System.out.println("Frequencia:"+dados_memoria.getFrequencia());
        System.out.println("Modelo:"+dados_memoria.getModelo());
        System.out.println("Marca:"+dados_memoria.getMarca());
        System.out.println("Capacidade memoria:"+dados_memoria.getCapacidade_armazenamento());

        System.out.println("Dados processador");
        System.out.println("Frequencia:"+processador.getFrequencia());
        System.out.println("Modelo"+processador.getModelo());
        System.out.println("Marca"+processador.getMarca());
    }
}
