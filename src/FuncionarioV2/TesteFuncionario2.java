/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioV2;

public class TesteFuncionario2 {
 public static void main (String[] args){
  FuncionarioV2 F2= new FuncionarioV2();
  F2.Ativo = true;
  F2.Departamento = "Suporte";
  F2.RG = "MG14961805";
  F2.Nome = "Rafael Nepomuceno";
  F2.Salario = 1400;
  F2.entrada = "20/04/2019";
  
  F2.mostrar(); 
  
  FuncionarioV2 f1= new FuncionarioV2();
  f1.Nome ="pedro";
  f1.Salario = 100.0;
  
  FuncionarioV2 f2= new FuncionarioV2();
  f2 = f1;
  
  if (f1==f2){
      System.out.println ("iguais");
      
      //situação 2
      
  }
  
}   
}
