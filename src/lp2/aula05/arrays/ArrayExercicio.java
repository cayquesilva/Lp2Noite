/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05.arrays;

import java.util.Scanner;

/**
 *
 * @author Cayque
 */
public class ArrayExercicio {
    public int tamanho;
    public int escalar;
    public int[] vet1,vet2,vet3,vet4;
    
    public String tipo;
    public Scanner s = new Scanner(System.in);
    
    public void preenche(){
        vet1= new int[tamanho];
        vet2= new int[tamanho];
        for(int i=0;i<vet1.length;i++){
            System.out.print("Digite o valor da posição ["+i+"] do vetor 1: ");
            this.vet1[i]=s.nextInt();
        }
        for(int i=0;i<vet2.length;i++){
            System.out.print("Digite o valor da posição ["+i+"] do vetor 2: ");
            this.vet2[i]=s.nextInt();
        }
     }
    
    public void mostrar(){
        System.out.println("Os vetores que você preencheu são:");
        System.out.print("Vetor 1: ");
        for(int i=0;i<vet1.length;i++){
            System.out.print(vet1[i]+" ");
        }
        System.out.println("");
        System.out.print("Vetor 2: ");
        for(int i=0;i<vet2.length;i++){
            System.out.print(vet2[i]+" ");
        }
    }
    public void resultado(){
        vet3= new int[tamanho];
        vet4= new int[tamanho];
        switch(tipo){
            case "+":
                System.out.println("A soma dos vetores é respectivamente: ");
                for(int i=0;i<tamanho;i++){
                    vet3[i]=(vet1[i]+vet2[i]);
                    System.out.print(vet3[i]+" ");
                }
                break;
                
            case "-":
                System.out.println("A subtração dos vetores é respectivamente: ");
                for(int i=0;i<tamanho;i++){
                    vet3[i]=(vet1[i]-vet2[i]);
                    System.out.print(vet3[i]+" ");
                }
                break;
                
            case "*":
                System.out.println("");
                System.out.print("Digite o valor do escalar: ");
                escalar=s.nextInt();
                System.out.println("A multiplicação dos vetores por "+escalar+" é respectivamente: ");
                System.out.print("Vetor 1: ");
                for(int i=0;i<tamanho;i++){
                    vet3[i]=(vet1[i]*escalar);
                    vet4[i]=(vet2[i]*escalar);
                    System.out.print(vet3[i]+" ");
                }
                System.out.println("");
                System.out.print("Vetor 2: ");
                for(int i=0;i<tamanho;i++){
                    System.out.print(vet4[i]+" ");
                }
                break;
                
            case "**":
                System.out.println("A multiplicação do vetor 1 com o vetor 2 resulta em: ");
                for(int i=0;i<tamanho;i++){
                    vet3[i]=(vet1[i]*vet2[i]);
                    System.out.print(vet3[i]+" ");
                }
                break;
            }
    }
}
