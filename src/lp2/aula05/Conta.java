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
public class Conta {
    public double saldo, limite;
    public int numero;
    Cliente correntista;
    Agencia banco;
    
    public void mostra(){
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Saldo: "+this.numero);
        System.out.println("Saldo: "+this.limite);
        System.out.println("--------------------");
    }
    
    void depositarValor(double valor){
        saldo+=valor;
    } 
    
    double consultarSaldo(){
        return this.saldo+this.limite;
    }
    
    void transferencia(Conta destino, double valor){
        
    }
    
    void sacarValor(double valor){
       if(verificarSaldo(valor)){
           
       }else{
           System.out.println("Saque Indisponível...");
           
       } 
    }
    boolean verificarSaldo(double valor){
        
        boolean t=false;
        
        return t;
    }

  
    
}
