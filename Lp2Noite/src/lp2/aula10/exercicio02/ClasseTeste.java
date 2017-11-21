package lp2.aula10.exercicio02;

import java.util.Scanner;

public class ClasseTeste {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Controle controle = new Controle();

        controle.setString("testando esse exercicio doido!");
        System.out.println("A quantidade de caracteres é: "+controle.getCaracteres(controle.getString()));
        System.out.println("A quantidade de palavras é: "+controle.getPalavras(controle.getString()));
        
        
        Controle c1 = new Controle();
        
        System.out.println("Digite uma frase: ");
        c1.setString(s.nextLine());
        
        System.out.println("A quantidade de caracteres é: "+c1.getCaracteres(c1.getString()));
        System.out.println("A frase em maiúsculo é: "+c1.getString().toUpperCase());
        System.out.println("A quantidade de vogais é:"+c1.getVogais(c1.getString()));
        System.out.println("A quantidade de digitos é: "+c1.getDigitos(c1.getString()));
        System.out.println("A string é palindroma? "+c1.isPalindrome(c1.getString()));
        c1.removeEspaco(c1.getString());
    }

    
}
