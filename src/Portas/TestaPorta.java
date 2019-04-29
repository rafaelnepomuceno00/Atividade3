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
public class TestaPorta {
    public static void main (String[]args){
    
        Porta PO1 = new Porta ();
        PO1.cor = "Branca";
        PO1.dimensaoX = 120; //centimetros
        PO1.dimensaoY = 210;
        PO1.dimensaoZ = 5;
        PO1.aberta = true;
        
        PO1.abre();
        PO1.estaAberta();
        
        PO1.fecha();
                    
        PO1.pinta("Marrom");
        PO1.pinta("Roxo");
        
        System.out.println("Nova cor:" + PO1.cor);
        
        PO1.estaAberta();
        
        
        
    }
    
}
