package lp2.aula05;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cayque
 */
public class Cliente {
    String nome,cpf;
   
    /*
    Cliente(){ //contrutor default
        
    }
   
    Cliente(String nome){ //contrutor precisando de nome
        this.nome=nome;
    }
    
    Cliente(String nome, String cpf){ // construtor precisando de nome e cpf
        this.nome=nome;
        this.cpf=cpf;
    }
// dessa forma, a classe pode ser configurada de modo a aceitar apenas clientes com nome e cpf digitados, etc...
*/
    
    Cliente(){ //contrutor default
    }
   
    Cliente(String nome){ 
        this.nome=nome;
    }
    
    Cliente(String nome, String cpf){ 
        this(nome); // Mesma coisa de cima, porém ao inves de existir redundância, está chamando o "nome" contido no contrutor acima, pois é executado em modo de pilhas.
        this.cpf=cpf; // Dessa forma, o que está acima, é executado primeiro e pode ser usado abaixo.
    }
  
    void mudarNome(String nome){
        this.nome = nome;
    }
    
    
    
}
