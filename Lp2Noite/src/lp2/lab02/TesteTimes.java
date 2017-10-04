package lp2.lab02;
// criar 6 times
// adicionar jogadores

import java.util.Scanner;

// adicionar comissao tecnicas e funcionarios
// criar arbitros
// criar partidas
// criar estadios
// ver partidas
// etc etc etc

public class TesteTimes {
    
    public static void imprimeTimeEstadio(Estadio e) {
        for (int i = 0; i < e.getQuantideTimes(); i++) {
            System.out.println("Clube: " + e.getTimes()[i].getNome());

        }
    }

   
    public static void main(String args[]) {
        String op;
        Scanner s = new Scanner(System.in);
        Clube time = new Clube();
        Estadio e1 = new Estadio();
        
        do{
            System.out.println("*--------------------------------------------------------*");
            System.out.println("*--------------------------------------------------------*");
            System.out.println("*--------------- Selecione a opção desejada -------------*");
            System.out.println("*--------------      DIGITE A PALAVRA      --------------*");
            System.out.println("*-------- [ CLUBE ]  para criar um clube   --------------*");
            System.out.println("*-------- [ ESTADIO ] para criar um estádio -------------*");
            System.out.println("*-------- [ PARTIDA ] para criar uma partida ------------*");
            System.out.println("*-------- [ JOGADOR ] para criar um jogador -------------*");
            System.out.println("*-------- [ ARBITRO ] para criar um arbitro -------------*");
            System.out.println("*-------- [ FUNCIONARIO ] para criar um funcionario  ----*");
            System.out.println("*-------- [ SAIR ] para finaliar o programa  ------------*");
            System.out.println("*--------------------------------------------------------*");
            System.out.println("*--------------------------------------------------------*");
            op= s.nextLine();
            switch(op){
            case "clube":
                System.out.println("Digite o nome do clube: ");
                time.setNome(s.nextLine());
                System.out.println("Digite o estado do clube: ");
                time.setEstado(s.nextLine());
                System.out.println("Digite a cidade do clube: ");
                time.setCidade(s.nextLine());
                break;
                
            case "estadio":
                System.out.println("Digite o nome do estadio: ");
                e1.setNome(s.nextLine());
                System.out.println("Digite o estado do estadio: ");
                e1.setEstado(s.nextLine());
                System.out.println("Digite a cidade do estadio: ");
                e1.setCidade(s.nextLine());
                System.out.println("Deseja adicionar um time nesse estadio? SIM ou NAO");
                op = s.nextLine();
                if("sim".equals(op)){
                   
                }
                break;
        }
            System.out.println(time.getNome());
        }while(!"sair".equals(op));
        
        
            
          

        
     
        
        
        
        
        
        
        
        
        
        
/*        
        Clube time1 = new Clube();
        Clube time2 = new Clube();
        Clube time3 = new Clube();

        time1.setNome("Flamengo");
        time2.setNome("Fluminense");
        time3.setNome("Sao Paulo");

        Estadio e1 = new Estadio();
        Estadio e2 = new Estadio();

        e1.setNome("Maracana");
        e1.setTimes(time1);
        e1.setTimes(time2);
        e2.setNome("Morumbi");
        e2.setTimes(time3);

        System.out.println("Estadio: " + e1.getNome());
        imprimeTimeEstadio(e1);

        System.out.println("Estadio: " + e2.getNome());
        imprimeTimeEstadio(e2);

*/
    }
    
}
