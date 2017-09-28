/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula06.encapsulamentos;

import lp2.aula05.*;

/**
 *
 * @author cayque
 */
public class ContaTeste {
    public static void main (String args[]){
        Cliente c1 = new Cliente();
        Agencia a = new Agencia();
        System.out.println(Conta.getQuantidade());
        Conta conta1 = new Conta();
        conta1.setNumero(123);
        conta1.setLimite(250);
        conta1.setSaldo(100);
        conta1.setCorrentista(c1);
        conta1.setAgencia(a);
       
        conta1.getAgencia().setNumero(1111);
        conta1.getAgencia().setNome("Centro");

        conta1.getCorrentista().cpf = "111222233344";
        conta1.getCorrentista().nome="Cayque Silva";
        System.out.println("Cliente: " + conta1.getCorrentista().nome);
        System.out.println("Saldo: " + conta1.getSaldo());
        conta1.depositarValor(200);
        System.out.println("Novo Saldo: " + conta1.getSaldo());
        System.out.println("Saldo+Limite: " + conta1.consultarSaldo());
        System.out.println("Quantidade de contas: "+Conta.getQuantidade());
        Conta.zerarQuantidade();
        System.out.println("Quantidade de contas: "+Conta.getQuantidade());
    }
}
