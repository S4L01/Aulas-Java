/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia04.att4;

/**
 *
 * @author aluno.den
 */
public class principal {

    public static void main(String[] args) {
        cliente clientes = new cliente("salin", 18, "rua alvaro franca", 719886644);
        veiculo veiculos = new veiculo("agr 405", "azul", 5, 50.00, 100, 100);
        
        System.out.println("\nDados cliente");
        System.out.println("Nome:"+clientes.getNome());        
        System.out.println("Idade:"+clientes.getIdade());        
        System.out.println("Enderço:"+clientes.getEndereco());        
        System.out.println("Telefone:"+clientes.getTelefone());
        
        System.out.println("\nDados do veiculo");
        System.out.println("Placa:"+veiculos.getPlaca());        
        System.out.println("Cor:"+veiculos.getCor());        
        System.out.println("Capacidade do Tanque:"+veiculos.getCap_tanque());        
        System.out.println("Consumo medio:"+veiculos.getConsumo_medio());        
        System.out.println("Numero de passageiros:"+veiculos.getNumero_passageiros());        
        System.out.println("Velocidade Maxima:"+veiculos.getVelocidade_max());        
    }
}
