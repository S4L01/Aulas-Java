/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia06.ex03;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Caja V", "12", "Ao lado do doce gelado", "4005-320", "Salvador", UnidadeFederativa.BAHIA);
        Fisica pessoa_fisica = new Fisica(Sexo.FEMININO, "900.983.432-32", "909-83832", "10/01/2004", 5.000, 4004, "Hadonay", "719834343", endereco);
        Juridica pessoa_juridica = new Juridica("4009429", "123", "10/09", "13/05", "3000", 1120, "Hadonay Salo", "71984712910", 
                new Endereco("Vista Alegre", "12", "Ao lado do bar", "400900", "Salcador", UnidadeFederativa.BAHIA));
        
        
        System.out.println(pessoa_fisica);
        System.out.println(pessoa_juridica);
        
                }
}
