/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioV3;

/**
 *
 * @author rafae
 */
public class TestarfuncionarioV3 {
    public static void main(String[] args) {
        
        FuncionarioV3 F3 = new FuncionarioV3 ();
        
        F3.Ativo = true;
        F3.Departamento = "Suporte";
        F3.RG = "MG14961805";
        F3.Nome = "Rafael Nepomuceno";
        F3.Salario = 1400;
        
        
        Data D3 = new Data ();
        D3.dia = 20;
        D3.mes = 04;
        D3.ano = 2019;
        
        F3.DataEntrada = D3;

        F3.Bonfifica(20);

        F3.Demitir();

        F3.Mostrar();

    }
    
}
  
