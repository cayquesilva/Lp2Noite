package lp2.aula08.classeabstrata;
/**
 *
 * @author cayque
 */
abstract class Conta { //É uma classe abstrata, dessa forma ela não pode ser instanciada.
    private double saldo;
    private int numero;
    private Cliente cliente;
    private Agencia agencia;
    public static int quantidade=0;
    
    Conta(){
        quantidade++;
    }
    
    void depositarValor(double valor){
        descontarTarifa();
        this.setSaldo(this.getSaldo()+valor);
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
   
   public Cliente getCliente(){
       return cliente;
   }
   
   public void setCliente(Cliente cliente){
       this.cliente = cliente;
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
   
   public abstract void imprimeExtratoDetalhado(); // Método abstrato, obriga a ser usado
   //em todas as subclasses da Superclasse "Conta".
}
