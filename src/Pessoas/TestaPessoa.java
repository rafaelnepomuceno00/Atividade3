/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;


public class TestaPessoa {
public static void main(String[] args){

Pessoa P1 = new Pessoa ();
P1.idade = 20;
P1.nome = "Rafael";

P1.fazAniversario();
P1.fazAniversario();
P1.fazAniversario();    



System.out.println("Nome: " +P1.nome ); 
System.out.println("idade: " +P1.idade );
}
 
}
