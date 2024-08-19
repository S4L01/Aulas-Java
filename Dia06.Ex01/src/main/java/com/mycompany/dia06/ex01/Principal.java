/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia06.ex01;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Fisica pessoa_fisica = new Fisica("1192466617", "232323", "10/01", "SALO", "71 998891");
        Juridica pessoa_Juridica = new Juridica("40028922", "11221111", "Empresa", "5004430");
        
        
        System.out.println(pessoa_fisica);
        System.out.println(pessoa_Juridica);
    }
}
