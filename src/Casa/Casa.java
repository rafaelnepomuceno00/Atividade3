/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

public class Casa {
String cor;
boolean porta1;
boolean porta2;
boolean porta3;

void pinta(String s){
 cor = s;   

}
int quantasPortasEstaoAbertas(){
 int portasAbertas = 0;
 
    if (porta1 == true) {

        portasAbertas+= 1;}
    
    if (porta2 == true) {

        portasAbertas +=1;}
    

    if (porta3 == true) {
        portasAbertas +=1;
    }
    
    return portasAbertas;

} 
}
