/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoteoriadosgrafos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Allef
 */
public class ProjetoTeoriaDosGrafos {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        
        int op = 0, ver = 0, linha = 0, coluna = 0;
        int loop = 0;
        Scanner scaner = new Scanner(System.in);
        
        System.out.print("Digite 1 para Grafo ou 2 Para Digrafo:");
        op = scaner.nextInt();
        System.out.print("Informe a Quantidade de Vertices:");
        ver = scaner.nextInt();
        System.out.print("Informe a Quantidade de Arestas:");
        loop = scaner.nextInt();
        int mat[][] = new int[ver][ver];

        if (op == 1) {
            System.out.println("\nGrafo ... ");

            for (int i = 0; i < loop; i++) {
                System.out.println("\nAresta: "+ (i + 1));
                System.out.print("Informe o Vertice de origem: ");
                linha = scaner.nextInt();
                System.out.print("Informe o Vertice de destino: ");
                coluna = scaner.nextInt();
                if (linha == coluna) { // recursão
                    mat[linha - 1][coluna - 1] = 1;
                } else {
                    mat[linha - 1][coluna - 1] = 1;
                    mat[coluna - 1][linha - 1] = 1;
                }

            }
            mostrarMatri(ver, mat);

        } else if (op == 2) {
            System.out.print("\nDigrafo ... ");
            for (int i = 0; i < loop; i++) {
                System.out.println("\nAresta: "+ (i + 1));
                System.out.print("Informe o Vertice de origem: ");
                linha = scaner.nextInt();
                System.out.print("Informe o Vertice de destino: ");
                coluna = scaner.nextInt();
                if (linha == coluna) { // recursão
                    mat[linha - 1][coluna - 1] = 1;
                } else {
                    mat[linha - 1][coluna - 1] = 1;
                   // mat[coluna - 1][linha - 1] = 1;
                }

            }
            mostrarMatri(ver, mat);
            

        }

    }

    public static void mostrarMatri(int v, int ma[][]) {
        System.out.println("\n\n## MATRIZ ##");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(ma[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
