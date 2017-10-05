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
    
    public static void imprimeTime(Clube[] clube,int auxiliar){
        for (int i = 0;i<auxiliar;i++){
            System.out.println("Digite "+i+" para adicionar "+clube[i].getNome());
        }
    }
    
    public static void imprimeEstadio(Estadio[] e,int auxiliar) {
        for (int i = 0; i < auxiliar; i++) {
            System.out.println("Digite "+i+" para adicionar ao "+e[i].getNome());

        }
    }

   
    public static void main(String args[]) {
        String op,auxiliar;
        Scanner s = new Scanner(System.in);
        int i=0,j=0,aux=0,aux1,aux2,quantTime=0;
        Clube time[] = new Clube[6];
        Estadio est[] = new Estadio[2];
              
        do{
            System.out.println("*--------------------------------------------------------*");
            System.out.println("*--------------------------------------------------------*");
            System.out.println("*--------------- Selecione a opção desejada -------------*");
            System.out.println("*--------------      DIGITE A PALAVRA      --------------*");
            System.out.println("*-------- [ CLUBE ]  para criar os clubes  --------------*");
            System.out.println("*-------- [ ESTADIO ] para criar um estádio -------------*");
            System.out.println("*-------- [ VINCULAR ] para vincular um time a um estádio*");
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
                    //for(int j=0;j<6;j++){
                    do{ // para repetir o codigo enquanto eu disser que quero adicionar mais um clube. Maximo de clubes 6
                    if(j<6){ 
                        System.out.println("Digite o nome do "+(j+1)+"º clube");//, cidade e estado do "+i+ "º clube");
                        time[j] = new Clube();
                        time[j].setNome(s.nextLine());
                        //time[i].setCidade(s.nextLine());
                        //time[i].setEstado(s.nextLine());
                        quantTime++;
                        j++;
                        System.out.println("Deseja adicionar outro clube? SIM ou Nao?");
                        auxiliar=s.nextLine();
                        }else{
                            System.out.println("Você já digitou o numero máximo de clubes!");
                            break;
                        }
                    }while(auxiliar.equals("sim"));
                    
                break;
                
                case "estadio":
                    do{
                    if(i<2){
                    System.out.println("Digite o nome do estadio");
                    est[i] = new Estadio();
                    est[i].setNome(s.nextLine());
                    //est[i].setCidade("Campina");
                    //est[i].setEstado("PB");
                    aux++;
                    i++;
                    System.out.println("Deseja adicionar outro estadio? Sim ou Não?");
                    auxiliar=s.nextLine();
                    }else{
                        System.out.println("Você já criou os 2 estádios.");
                        break;
                    }
                    }while(auxiliar.equals("sim"));
                break;
                
                case "vincular":
                    System.out.println("Qual o estádio que você deseja adicionar times?");
                    imprimeEstadio(est,aux);
                    aux1=s.nextInt();
                    for(i=0;i<aux;i++){
                        if(i==aux1){
                            System.out.println("Escolha o time que você deseja adicionar ao estádio");
                            imprimeTime(time,quantTime);
                            aux2=s.nextInt();
                            est[aux1].setTimes(time[aux2]);
                        }
                    }
        }
        }while(!"sair".equals(op));
        
        
    }
    
}
