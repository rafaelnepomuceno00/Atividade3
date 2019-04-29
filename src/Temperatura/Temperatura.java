/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperatura;

public class Temperatura {

    double converterParacelsius(double Fnt){
     double C;
     C = (Fnt-32) / 1.8;
    return C; 
    }
    
    double converterParaFarenheit(double Celsius){
     double Fnt;
     
     Fnt= (1.8*Celsius)+32;
    
    return Fnt;
    }
    }
