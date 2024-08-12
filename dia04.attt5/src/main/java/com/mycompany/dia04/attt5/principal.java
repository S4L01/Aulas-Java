/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia04.attt5;

/**
 *
 * @author aluno.den
 */
public class principal {

    public static void main(String[] args) {
        conta_bancaria dados_bancario = new conta_bancaria("inter", "005", "002", "cc", "1000", "2000");
        funcionario dados_funcionario1 = new funcionario("4002 8922", "Fransley", "ladeira da cemiterio", "992201426", "cfran", dados_bancario);
        funcionario dados_funcionario2 = new funcionario("4004 9922", "SALO", "CajaCity", "88664433", "csalo", new conta_bancaria
        ("itau", "1001", "009008", "corrente", "milhoes", "trilhoes"));
        
        System.out.println("\nDados Funcionario:");
        System.out.println("Nome:"+dados_funcionario1.getNome());
        System.out.println("Codigo:"+dados_funcionario1.getCodigo());
        System.out.println("E-mail:"+dados_funcionario1.getEmail());
        System.out.println("Telefone:"+dados_funcionario1.getTelefone());
        System.out.println("Endereco:"+dados_funcionario1.getEndereco());
        System.out.println("Banco:"+dados_funcionario1.getContaBanco().getBanco());
        
        System.out.println("\nDados Funcionario2:");
        System.out.println("Nome:"+dados_funcionario2.getNome());
        System.out.println("Codigo:"+dados_funcionario2.getCodigo());
        System.out.println("E-mail:"+dados_funcionario2.getEmail());
        System.out.println("Telefone:"+dados_funcionario2.getTelefone());
        System.out.println("Endereco:"+dados_funcionario2.getEndereco());
        System.out.println("Banco:"+dados_funcionario2.getContaBanco().getBanco());
    }
}
