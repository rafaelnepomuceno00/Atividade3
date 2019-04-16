/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioV2;

/**
 *
 * @author ifnmg
 */
public class FuncionarioV2 {
    String Nome;
    String Departamento;
    double Salario;
    String entrada;
    String RG;
    boolean Ativo;    
    
    void bonfifica(double aumento){
     this.Salario = Salario*(aumento/100);
         
    } 
    void demite(){
    Ativo= false;
    }
    void imprime(){
    System.out.println("nome do funcionario: " + Nome); 
    System.out.println("departmento do funcionario: " + Departamento);
    System.out.println("salario do funcionario: " + Salario);
    System.out.println("entrada do funcionario: " + entrada);
    System.out.println("rg do funcionario: " + RG);
    System.out.println("situação do funcionario: " + Ativo);
    
    }
    }
  
