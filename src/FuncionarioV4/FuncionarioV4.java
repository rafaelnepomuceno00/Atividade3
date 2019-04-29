/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioV4;

public class FuncionarioV4 {
    
    
    
    String Nome;
    String Departamento;
    double Salario;
    Data DataEntrada;
    String RG;
    boolean Ativo;    
    
    void Bonfifica(double aumento){
     this.Salario += Salario*(aumento/100);
         
    } 
    void Demitir(){
    Ativo= false;
    }
    void Mostrar(){
    System.out.println("nome do funcionario: " + Nome); 
    System.out.println("departmento do funcionario: " + Departamento);
    System.out.println("salario do funcionario: " + Salario);
    System.out.println("entrada do funcionario: " + DataEntrada.dia + "/" + DataEntrada.mes +"/" + DataEntrada.ano);
    System.out.println("rg do funcionario: " + RG);
    System.out.println("situação do funcionario: " + Ativo);
    
    DataEntrada.MostraData();
    } 
    boolean Equals(FuncionarioV4 OutroFuncionario) {
        if (this.Nome.equals(OutroFuncionario.Nome)
                && (this.RG.equals(OutroFuncionario.RG))) {

            System.out.println("Iguais");
            return true;

        }
            System.out.println("Diferentes");
            return false;
    }
    }
