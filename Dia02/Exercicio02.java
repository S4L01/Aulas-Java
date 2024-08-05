/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Dia02;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
        
        System.out.println("Digite o numero:");
        int numero_um = teclado.nextInt();
        
        System.out.println("Digite outro numero:");
        int numero_dois = teclado.nextInt();
        
        int maior_numero;
        int menor_numero;
        if (numero_um > numero_dois){
            maior_numero = numero_um;
            menor_numero = numero_dois;
            
        }
        else{
            maior_numero = numero_dois;
            menor_numero = numero_um;
            
        }
        System.out.println("Maior Numero:"+maior_numero);
        System.out.println("Menor Numero:"+menor_numero);
    }
}

