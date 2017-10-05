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
        String op,auxiliar;
        Scanner s = new Scanner(System.in);
        int i=0,j=0,aux=0;
        Clube time[] = new Clube[6];
        Estadio e[] = new Estadio[2];
              
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
            System.out.println(i);
            switch(op){
            
                case "clube":
                time[i] = new Clube();
                System.out.println("Digite o nome do clube: ");
                time[i].setNome(s.nextLine());
                System.out.println("Digite o estado do clube: ");
                time[i].setEstado(s.nextLine());
                System.out.println("Digite a cidade do clube: ");
                time[i].setCidade(s.nextLine());
                i++;
                break;
                
                case "estadio":
                e[j] = new Estadio();
                time[i] = new Clube();
                System.out.println("Digite o nome do estadio: ");
                e[j].setNome(s.nextLine());
                System.out.println("Digite o estado do estadio: ");
                e[j].setEstado(s.nextLine());
                System.out.println("Digite a cidade do estadio: ");
                e[j].setCidade(s.nextLine());
                
                System.out.println("Deseja adicionar um time nesse estadio? SIM ou NAO");
                op = s.nextLine();
                while(op.equals("sim")){
                    System.out.println("Digite o nome do time que você deseja adicionar a esse estádio: ");
                    auxiliar = s.nextLine();
                    for(i=0;i<6;i++){
                        System.out.println(i);
                        if(time[i].getNome().equals(auxiliar)){
                            e[j].setTimes(time[i]);
                            aux++;
                        }else{
                            aux=0;
                        }
                    }
                    System.out.println("Esse time não existe ou o estádio já possui 4 times");
                    System.out.println("Deseja tentar novamente? SIM ou NAO");
                    op = s.nextLine();
                }
                break;
        }
        }while(!"sair".equals(op));
        
        
    }
    
}
