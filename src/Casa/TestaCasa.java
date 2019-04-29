/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

public class TestaCasa {
 public static void main(String []args){
 
 Casa C1 = new Casa();
  C1.cor = "verde claro";
  C1.porta1 = true;
  C1.porta2 = true;
  C1.porta3 = true;
  
  
  System.out.println(C1.quantasPortasEstaoAbertas());
 
 } 
}
