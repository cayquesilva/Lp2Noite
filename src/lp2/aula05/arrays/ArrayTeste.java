/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05.arrays;

import java.util.Arrays;

/**
 *
 * @author cayque
 */
public class ArrayTeste {
    public static void main(String args[]){
        int vet1[] = new int[3];
        int vet2[] = {35,85,9};
        Arrays.sort(vet2);// Usando método para sortear em ordem crescente os elementos do vet2 (automaticamente importa a "java.util.Arrays".
        Arrays.fill(vet1,5);// Preenche todo o vetor com o valor após a viírgula, no caso, 5.
       
        
        /* for(int i=0;i<vet2.length;i++){ // Esse vet2.length serve para pegar o tamanho do vetor que está antes do " . " no caso, vet2. Dessa forma o i percorre o vetor desejado.
            System.out.println(vet2[i]);
        }*/
          for(int i : vet1){        //Mesma coisa do for anterior, porém o I será o valor de cada elemento do vetor, por isso coloca-se o "print I".
              System.out.println(i);
        }  
        
          for(int i : vet2){        //Mesma coisa do for anterior, porém o I será o valor de cada elemento do vetor, por isso coloca-se o "print I".
              System.out.println(i);
        }   
    }
}
