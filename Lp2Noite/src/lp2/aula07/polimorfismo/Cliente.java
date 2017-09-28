package lp2.aula07.polimorfismo;
/**
 *
 * @author cayque
 */
public class Cliente {
    String nome,cpf;
    
    Cliente(){ //contrutor default
 
    }
   
    Cliente(String nome){ //contrutor precisando de nome
        this.nome=nome;
    }
    
    Cliente(String nome, String cpf){ // construtor precisando de nome e cpf
        this.nome=nome;
        this.cpf=cpf;
    }// dessa forma, a classe pode ser configurada de modo a aceitar apenas clientes com nome e cpf digitados, etc...
    
    void mudarNome(String nome){
        this.nome=nome;
    }  
}
