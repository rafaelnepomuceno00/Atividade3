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
public class FuncionarioV1 {
    
    String Nome;
    String Departamento;
    double Salario;
    String entrada;
    String RG;
    boolean Ativo;    
    
    void bonfifica(double aumento){
     this.Salario = Salario*(aumento/100);
         
    }    
}
