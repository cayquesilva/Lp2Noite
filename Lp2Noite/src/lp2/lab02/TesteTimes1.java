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

public class TesteTimes1 {
    
    public static void imprimeTimeEstadio(Estadio e) {
        for (int i = 0; i < e.getQuantideTimes(); i++) {
            System.out.println("Clube: " + e.getTimes()[i].getNome());

        }
    }
    
    public static void imprimeTime(Clube[] clube){
        for (int i = 0;i<clube.length;i++){
            System.out.println("Digite "+i+" para adicionar "+clube[i].getNome());
        }
    }
    
    public static void imprimeEstadio(Estadio[] e,int auxiliar) {
        for (int i = 0; i < auxiliar; i++) {
            System.out.println("Digite "+i+" para adicionar ao "+e[i].getNome());

        }
    }

   
    public static void main(String args[]) {
        
        Clube[] times= new Clube[6];
        Estadio[] est = new Estadio[2];
        Scanner s = new Scanner(System.in);
        String op;
        int i=0,aux=0,aux1,aux2;
        
        for(int j=0;j<6;j++){
            System.out.println("Digite o nome do "+(j+1)+"º clube");//, cidade e estado do "+i+ "º clube");
            times[j] = new Clube();
            times[j].setNome(s.nextLine());
            //times[i].setCidade(s.nextLine());
            //times[i].setEstado(s.nextLine());
        }
        
        System.out.println("Deseja adicionar um estadio? Sim ou Não?");
        op=s.nextLine();
        while(op.equals("sim")){
            if(i<2){
                System.out.println("Digite o nome do estadio");
                est[i] = new Estadio();
                est[i].setNome(s.nextLine());
                //est[i].setCidade("Campina");
                //est[i].setEstado("PB");
                aux++;
                i++;
                System.out.println("Deseja adicionar outro estadio? Sim ou Não?");
                op=s.nextLine();
            }else{
                System.out.println("Você já criou os 2 estádios.");
                op="nao";
            }
        }
        
        System.out.println("Deseja adicionar um clube em algum estádio?");
        op=s.nextLine();
        while("sim".equals(op)){
            System.out.println("Qual o estádio que você deseja adicionar times?");
            imprimeEstadio(est,aux);
            aux1=s.nextInt();
            for(i=0;i<aux;i++){
                if(i==aux1){
                    System.out.println("Escolha o time que você deseja adicionar ao estádio");
                    imprimeTime(times);
                    aux2=s.nextInt();
                    est[aux1].setTimes(times[aux2]);
                }
            }
            System.out.println("Deseja adicionar um clube em algum estádio?");
            op=s.nextLine();
            }
        
        imprimeTimeEstadio(est[0]);
        imprimeTimeEstadio(est[1]);
        }
      
    }

