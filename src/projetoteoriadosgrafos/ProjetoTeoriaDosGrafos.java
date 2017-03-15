/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoteoriadosgrafos;

import java.util.Scanner;

/**
 *
 * @author Allef
 */
public class ProjetoTeoriaDosGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op =0;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Digite 1 para Grafo ou 2 Para Digrafo :");
        op = scaner.nextInt();
        
        if(op == 1){
            System.out.println("Grafo ... ");
            System.out.println("");
        }else if (op == 2 ){
            System.out.println("Digrafo ... ");

            
        }
        
        
        
        
      
    }
    
}
