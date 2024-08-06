/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadedia03;

/**
 *
 * @author aluno.den
 */
public class Livro {
    private String titulo;
    private String autor;
    private int numero_pag;
    private double preco;

    public Livro(String titulo, String autor, int numero_pag, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_pag = numero_pag;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_pag() {
        return numero_pag;
    }

    public void setNumero_pag(int numero_pag) {
        this.numero_pag = numero_pag;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
