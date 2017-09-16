/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05.arrays;

/**
 *
 * @author cayque
 */
public class ArrayTeste {
    public static void main(String[] args){
        
        ArrayExercicio vet = new ArrayExercicio();
        System.out.print("Digite o tamanho dos vetores: ");
        vet.tamanho=vet.s.nextInt();
        vet.preenche();
        System.out.println("");
        vet.mostrar();
        System.out.println("");
        System.out.println("");
        System.out.println("Digite + para adicionar");
        System.out.println("Digite - para subtrair");
        System.out.println("Digite * para Multiplicar por algum escalar");
        System.out.println("Digite ** para Multiplicar as 2 matrizes entre si");
        vet.tipo = vet.s.next();
        vet.resultado();
    }
}

