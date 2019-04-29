/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Portas;

/**
 *
 * @author rafae
 */
public class Porta {
   boolean aberta;
    String cor;
    float dimensaoX;
    float dimensaoY;
    float dimensaoZ;
    
    void abre(){
    
        aberta = true;
    }
    void fecha(){
    
        aberta = false;
    }
    void pinta(String s){
        
        cor = s;
    }
    boolean estaAberta(){
        
        if (aberta == true)
            System.out.println ("Porta Aberta");
        else 
            System.out.println ("Porta Fechada");
           return false;
    } 
}
