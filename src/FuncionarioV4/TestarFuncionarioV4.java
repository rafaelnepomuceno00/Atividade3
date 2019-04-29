/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioV4;

/**
 *
 * @author rafae
 */
public class TestarFuncionarioV4 {
 public static void main(String[] args) {
        
        FuncionarioV4 F4 = new FuncionarioV4 ();
        
        F4.Ativo = true;
        F4.Departamento = "Suporte";
        F4.RG = "MG14961805";
        F4.Nome = "Rafael Nepomuceno";
        F4.Salario = 1400;
        
        
        Data D4 = new Data ();
        D4.dia = 20;
        D4.mes = 04;
        D4.ano = 2019;
        
        F4.DataEntrada = D4;

        F4.Mostrar();
        
        
        FuncionarioV4 OutroF4 = new FuncionarioV4 ();
        
        OutroF4.Ativo = true;
        OutroF4.Departamento = "Suporte";
        OutroF4.RG = "MG14961805";
        OutroF4.Nome = "Rafael Nepomuceno";
        OutroF4.Salario = 1400;
        
        
        Data OD4 = new Data ();
        OD4.dia = 20;
        OD4.mes = 04;
        OD4.ano = 2019;
        
        OutroF4.DataEntrada = OD4;

        
        OutroF4.Mostrar();

        
        F4.Equals(OutroF4);
    }

    }   
