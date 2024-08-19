/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dia06.ex02;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Engenheiro funcao_engenheiro = new Engenheiro("1110", "SALO", "11.33.44555", "00-111", "5000");
        Medico funcao_medico = new Medico("Fran", "111.22.43454", "22-222312", "3000");
        Motoboy funcao_motoBoy = new Motoboy("Sla", "00.112.224.444-00", "00-991-8998", "1500");
        
        
        System.out.println(funcao_engenheiro);
        System.out.println(funcao_medico);
        System.out.println(funcao_motoBoy);
    }
}
