/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *
 * @author ifnmg
 */
public class TestaProduto {
    public static void main(String[] args){
    
     Produto P1 = new Produto();
     P1.preço = 1000;
     P1.nome = "Mochila";
     
     P1.aumenta25();
     System.out.println("novo preço: " +P1.preço);
     P1.diminuir10();
     System.out.println("novo preço: " +P1.preço);
     
     
     
     
    
    }
}
