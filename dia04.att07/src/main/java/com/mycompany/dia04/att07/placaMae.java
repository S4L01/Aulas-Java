/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dia04.att07;

/**
 *
 * @author aluno.den
 */
public class placaMae extends produto{
    private String soquete;

    public placaMae(String soquete, String modelo, String marca) {
        super(modelo, marca);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }
    
}
