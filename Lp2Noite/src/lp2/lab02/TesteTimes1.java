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

   
    public static void main(String args[]) {
        
        Clube times[] = new Clube[6];
        Estadio est[] = new Estadio[2];
        Scanner s = new Scanner(System.in);
        String op;
        int i=0;
        
        for(int j=0;j<6;j++){
            System.out.println("Digite o nome do "+(j+1)+"º clube");//, cidade e estado do "+i+ "º clube");
            times[j] = new Clube();
            times[j].setNome(s.nextLine());
            //times[i].setCidade(s.nextLine());
            //times[i].setEstado(s.nextLine());
        }
        
        System.out.println("Deseja adicionar um estadio? Sim ou Não?");
        op=s.nextLine();
        if("sim".equals(op)){
            System.out.println("Digite o nome do estadio");
            est[i] = new Estadio();
            est[i].setNome("Amigao");
            est[i].setCidade("Campina");
            est[i].setEstado("PB");
            i++;
        }else{
            System.out.println("Escolha outra opção.");
        }
        
        System.out.println("Deseja adicionar um clube em algum estádio?");
       
      
    }
}
