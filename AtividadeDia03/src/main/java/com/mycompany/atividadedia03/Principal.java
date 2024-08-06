/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedia03;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
    Livro dados_livro1 = new Livro("Game Of Thrones", "George R R", 100, 200);
    Livro dados_livro2 = new Livro("A culpa é das estrelas", "John Green", 150, 300);
        
        System.out.println("\nDados Livro 1");
        System.out.println("Livro:"+dados_livro1.getTitulo());
        System.out.println("Autor:"+dados_livro1.getAutor());
        System.out.println("Número de paginas:"+dados_livro1.getNumero_pag());
        System.out.println("Valor:"+dados_livro1.getPreco());
        
        System.out.println("\nDados Livro 2");
        System.out.println("Livro:"+dados_livro2.getTitulo());
        System.out.println("Autor:"+dados_livro2.getAutor());
        System.out.println("Número de paginas:"+dados_livro2.getNumero_pag());
        System.out.println("Valor:"+dados_livro2.getPreco());
    
    }
}
