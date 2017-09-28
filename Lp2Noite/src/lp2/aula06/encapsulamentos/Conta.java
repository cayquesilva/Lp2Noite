package lp2.aula06.encapsulamentos;

import lp2.aula05.*;

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
    public double saldo, limite=250;
    public int numero;
    private Cliente correntista;
    private Agencia agencia;
    private static int quantidade=0;
    
    public static void setQuantidade(int aQuantidade){
        quantidade= aQuantidade;
    }
    
    public static int getQuantidade(){
        return quantidade;
    }
    
    Conta(){
        quantidade++;
    }
    
    void depositarValor(double valor){
        descontarTarifa();
        this.setSaldo(this.getSaldo()+valor);
    } 
    
    double consultarSaldo(){
        return this.getSaldo()+this.getLimite();
    }
    
    private void descontarTarifa(){
        this.setSaldo(getSaldo()-0.10);
    }
    
   public int getNumero(){
       return numero;
   }
    
   public void setNumero(int numero){
       this.numero = numero;
   }
   
   public Cliente getCorrentista(){
       return correntista;
   }
   
   public void setCorrentista(Cliente correntista){
       this.correntista = correntista;
   }
   
   public Agencia getAgencia(){
       return agencia;
   }
   
   public void setAgencia(Agencia agencia){
       this.agencia = agencia;
   }
   
   public double getSaldo(){
       return saldo;
   }
   
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   
   public double getLimite(){
       return limite;
   }
   
   public void setLimite(double limite){
       this.limite=limite;
   }
   
   public static void zerarQuantidade(){
       setQuantidade(0);
   } 
}
