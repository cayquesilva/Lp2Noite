/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05;

/**
 *
 * @author cayque
 */
public class ContaTeste {
    public static void main (String args[]){
        Cliente c1 = new Cliente();                         // pode ser usado das 3 formas pois o contrutor existe das 3 formas.
        Cliente c2 = new Cliente("Jonas da Silva");
        Cliente c3 = new Cliente("Jonas da Silva","15484584555");
        Agencia a = new Agencia();
        
        Conta conta1 = new Conta();
        a.nome="Bradesco";
        a.numero=384088;
        conta1.numero=123;
        conta1.limite=250;
        conta1.saldo=100;
        conta1.correntista=c1;
        conta1.correntista.nome="José da Silva";
        conta1.correntista.cpf="07558694511";
        
        conta1.banco=a;
        System.out.println("Cliente: "+conta1.saldo);
        conta1.depositarValor(200);
        System.out.println("Cliente: "+conta1.correntista.nome);
        System.out.println("Cliente: "+conta1.saldo);
        System.out.println(a.nome);
        c1.mudarNome("Cayque");
        System.out.println("Cliente: "+conta1.correntista.nome);
        
        System.out.println("Limite: "+conta1.consultarSaldo());
    }
}
