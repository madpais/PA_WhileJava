/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_while;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade_WHILE {

    public static void main(String[] args) {
       System.out.println("Olá querido...Quantos alunos têm em sua turma!");
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Integer> notas = new ArrayList<>();
        
        double alunos = ler.nextDouble();
        System.out.println("Certo! " + alunos + " alunos. Me informe as notas deles uma a uma!");
        
        int x = 1;
        int soma = 0;
        
        while(x <= alunos) {
            System.out.println("Nota do " + x + "º Aluno");
            int novaNota = ler.nextInt();
            notas.add(novaNota);
            x++;
            soma += novaNota;
        }
        
        System.out.println("A média da sua turma eh: " + (soma/alunos));
     }
}


