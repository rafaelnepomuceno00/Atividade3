/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioV1;

/**
 *
 * @author ifnmg
 */
public class TestarFuncionario {
 public static void main (String[] args){
  FuncionarioV1 F1 = new FuncionarioV1();
  F1.Ativo = true;
  F1.Departamento = "Suporte";
  F1.RG = "MG14961805";
  F1.Nome = "Rafael Nepomuceno";
  F1.Salario = 1400;
  F1.entrada = "20/04/2019";
 System.out.println("salario do funcionario 1: " + F1.Salario); 
 
 F1.bonfifica(20);
 
 System.out.println("salario do funcionario 1: " + F1.Salario); 
 
 F1.demite();
 System.out.println("situação do funcionario 1: " + F1.Ativo); 
}
}
