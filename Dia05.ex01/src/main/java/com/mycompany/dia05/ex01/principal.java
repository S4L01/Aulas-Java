/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia05.ex01;

/**
 *
 * @author aluno.den
 */
public class principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes(2006, "Salomao", 2000, Setor.MARKETING, Sexo.MASCULINO, 18);
       
        System.out.println("Dados Funcionario");
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("id: "+cliente.getId());
        System.out.printf("Salario: %.2f\n",cliente.getSalario());
        System.out.println("Setor: "+cliente.getSetor());
        System.out.println("Sexo: "+cliente.getSexo());
        System.out.println("Idade: "+cliente.getIdade());
 
    }
}
