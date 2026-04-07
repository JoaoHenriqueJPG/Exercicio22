/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio22;

/**
 *
 * @author Acer
 */
public class Main {

    public static void main(String[] args) {
        int contador = 1;
        double soma = 0.0;
        int limite = 1000;
        
        while (contador < limite) {
            soma += contador;
            contador++;
        }
            double media = soma/limite;
            System.out.println(media);
    }
}
