/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esfera;

/**
 *
 * @author rafae
 */
public class Esfera {
  
    float raio;
    
    
   double calculaVolume(){
   double volume;       
   volume= (4*3.14*(raio*raio*raio))/3;
   System.out.println("volume: "+volume);
   return volume;
   }   
}
