/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

public class Produto {

    double preço;
    String nome;

    void diminuir10() {
        double A;
        A = preço * 0.1;

        preço += A;

    }

    void aumenta25() {
        double A;
        A = preço * 0.25;

        preço += A;

    }
}
