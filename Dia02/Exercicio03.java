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
public class Exercicio03 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        //Pegando dados do aluno
        System.out.println("Digite o nome do aluno:");
        String nome_aluno = teclado.nextLine();
        
        System.out.println("Digite a primeria nota do aluno:");
        float primeira_nota = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota do aluno:");
        float segunda_nota = teclado.nextFloat();
        
        //calculando media do aluno
        float soma;
        float media;
        
        soma = primeira_nota + segunda_nota;
        
        media = soma/2;
        
        //exibindo resultado na tela
        String result;
        if (media < 7){
            result = "Aprovado";
            
    }else{
            result = "Reprovado";
        }
        
        System.out.println("Nome do Aluno:"+nome_aluno);
        System.out.println("Primeira Nota:"+primeira_nota);
        System.out.println("Segunda Nota:"+segunda_nota);
        System.out.println("Media do Aluno:"+media);
        System.out.println("Situação:"+result);
        
                
        
        
        }
    
    
            
    
}
