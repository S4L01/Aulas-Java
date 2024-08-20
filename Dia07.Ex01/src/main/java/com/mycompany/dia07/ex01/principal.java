/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia07.ex01;

/**
 *
 * @author aluno.den
 */
public class principal {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Condominio nao sei", "33", "Ao lado da sorveteria", "4000-300", "Salvador", UnidadeFederativa.BAHIA);
        Cliente cliente = new Cliente("comprei um produto etc", Sexo.FEMININO, EstadoCivil.CASADO, "17/05", "Franciele OLS", "71 98855630", "@gemil.com",endereco);
        
        PrestacaoServico prestacaoServico = new PrestacaoServico("11/12", "12/11", "11213445", "4001", "Fransley", "221212", "@gmail.vcom", 
                endereco = new Endereco("Ladeira do vai de F", "81", "Ao lado de algo", "31", "Salvador", UnidadeFederativa.BAHIA));
        
        
        System.out.println(cliente);
        System.out.println(prestacaoServico);
    }
}
