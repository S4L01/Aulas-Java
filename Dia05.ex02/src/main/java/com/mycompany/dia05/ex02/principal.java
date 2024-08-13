/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia05.ex02;
/**
 *
 * @author aluno.den
 */
public class principal {
    public static void main(String[] args) {
        Enderecos enderecos = new Enderecos("Rua alvaro", "4", "Ao lado de uma sorveteria", "400775", "Salvador", UnidadesFederativa.BAHIA);
        pessoas pessoa = new pessoas(1000, "Salomão", 18, "7198866545", "ppsaol@ggmai", Sexo.MASCULINO, enderecos);
       
       
        System.out.println("Dados:");
        System.out.println("Nome:"+pessoa.getNome());
        System.out.println("Id:"+pessoa.getId());
        System.out.println("Idade:"+pessoa.getIdade());
        System.out.println("Telefone:"+pessoa.getTelefone());
        System.out.println("Uf:"+pessoa.getEndereco().getUf().getSigla());
    }
}
