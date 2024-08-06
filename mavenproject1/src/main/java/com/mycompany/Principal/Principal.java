/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Principal;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        // instanciando um objeto.
        cliente clientes = new cliente("Marta",20);
        Funcionarios funcionario = new Funcionarios("salo","desenvolvedor ",2000);
        
        //clientes.nome = "Marta";
        //clientes.idade = 18;
        
        //clientes.setNome("Marta");
        //clientes.setIdade(20);
        
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Idade: " + clientes.getIdade());
        
        System.out.println("\nDados Fúncionario");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Sálario: " + funcionario.getSalario());
    }
}
