package lp2.lab02;
// criar 6 times
// adicionar jogadores
// adicionar comissao tecnicas e funcionarios
// criar arbitros
// criar partidas
// criar estadios
// ver partidas
// etc etc etc
import java.util.Scanner;

public class TesteTimes {
    
    public static void imprimeTimeEstadio(Estadio e) {
        if(e.getQuantideTimes()>0){
        for (int i = 0; i < e.getQuantideTimes(); i++) {
            System.out.println("Clube: " + e.getTimes()[i].getNome());
            }
        }else{
                System.out.println("Não existem times nesse estádio.");
            }
    }
    
    public static void imprimeJogadorTime(Jogador[] j,Clube[] c,int a) {
        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < a; k++) {
                System.out.println("Clube: "+c[i].getNome());
                System.out.println("Jogador: " + j[k].getNome());
            }
        }
    }
    
    
    public static void imprimeTime(Clube[] clube,int auxiliar){
        if(auxiliar>0){
            for (int i = 0;i<auxiliar;i++){
                System.out.println("Digite "+i+" para adicionar "+clube[i].getNome());
                }
        }else{
            System.out.println("Não existem times para serem selecionados!");
        }
    }
    
    public static void imprimeEstadio(Estadio[] e,int auxiliar) {
        if(auxiliar>0){
        for (int i = 0; i < auxiliar; i++) {
            System.out.println("Digite "+i+" para adicionar ao "+e[i].getNome());

        }
    }else{
            System.out.println("Não existem estádios cadastrados!");
        }
    }
    
    public static void imprimeArbitro(Arbitro[] e,int auxiliar) {
        if(auxiliar>0){
        for (int i = 0; i < auxiliar; i++) {
            System.out.println("Digite "+i+" para selecionar "+e[i].getNome());
        }
    }else{
            System.out.println("Não existem árbitros cadastrados!");
        }
    }

   
    public static void main(String args[]) {
        String op,auxiliar;
        Scanner s = new Scanner(System.in);
        int i=0,j=0,p,aux=0,aux1,aux2,quantTime=0,quantArbitro=0;
        Clube time[] = new Clube[6];
        Estadio est[] = new Estadio[2];
        Jogador jogador[] = new Jogador[20];
        Arbitro juiz[] = new Arbitro[5];
        Partida jogo[] = new Partida[3];
        ComissaoTecnica comissao[] = new ComissaoTecnica[5];
              
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
                    s.nextLine();
                    for(i=0;i<aux;i++){
                        if(i==aux1){
                            System.out.println("Escolha o time que você deseja adicionar ao estádio");
                            imprimeTime(time,quantTime);
                            aux2=s.nextInt();
                            s.nextLine();
                            est[aux1].setTimes(time[aux2]);
                            break;
                        }
                    }
                break;
                    
                case "jogador":
                    p=0;
                    do{ 
                    if(p<20){ 
                        System.out.println("Digite o nome do "+(p+1)+"º jogador");
                        jogador[p] = new Jogador();
                        jogador[p].setNome(s.nextLine());
                        //jogador[i].setCidade(s.nextLine());
                        //jogador[i].setEstado(s.nextLine());
                        //quantJogador++;
                        System.out.println("Deseja adicionar esse jogador em qual time?");
                        imprimeTime(time,quantTime);
                        aux1=s.nextInt();
                        s.nextLine();
                        for(i=0;i<quantTime;i++){
                            if(i==aux1){
                                time[i].setFuncionario(jogador[p]);
                            }
                        }
                        p++;
                        System.out.println("Deseja adicionar outro jogador? SIM ou Nao?");
                        auxiliar=s.nextLine();
                        }else{
                            System.out.println("Você já digitou o numero máximo de jogadores!");
                            break;
                        }
                    }while(auxiliar.equals("sim"));
                break;
                
                case "arbitro":
                    p=0;
                    do{ 
                    if(p<5){ 
                        System.out.println("Digite o nome do "+(p+1)+"º arbitro");
                        juiz[p] = new Arbitro();
                        juiz[p].setNome(s.nextLine());
                        p++;
                        quantArbitro++;
                        System.out.println("Deseja adicionar outro arbitro? SIM ou Nao?");
                        auxiliar=s.nextLine();
                        }else{
                            System.out.println("Você já digitou o numero máximo de arbitros!");
                            break;
                        }
                    }while(auxiliar.equals("sim"));
                break;
                
                case "partida":
                    p=0;
                    do{
                        if(p<3){
                            jogo[p] = new Partida();
                            System.out.println("Escolha o time mandante");
                            imprimeTime(time,quantTime);
                            aux2=s.nextInt();
                            s.nextLine();
                            jogo[p].setMandante(time[aux2]);
                            System.out.println("Escolha o time visitante");
                            imprimeTime(time,quantTime);
                            aux2=s.nextInt();
                            s.nextLine();
                            jogo[p].setVisitante(time[aux2]);
                            System.out.println("Escolha o arbitro para a partida.");
                            imprimeArbitro(juiz,quantArbitro);
                            aux2=s.nextInt();
                            s.nextLine();
                            for(i=0;i<quantArbitro;i++){
                                if(i==aux2){
                                    jogo[p].setJuizes(juiz[i]);
                                }
                            }
                            
                            p++;
                            System.out.println("Você deseja criar outra partida? SIM ou NAO?");
                            auxiliar=s.nextLine();
                                }else{
                                    System.out.println("Não podemos mais criar partidas!");
                                break;
                                }
                    }while(auxiliar.equals("sim"));
                break;
                        
                case "funcionario":
                    p=0;
                    do{
                        if(p<5){
                            
                            System.out.println("Digite o nome do funcionario");
                            comissao[p] = new ComissaoTecnica();
                            comissao[p].setNome(s.nextLine());
                            System.out.println("Deseja adicionar esse funcionario em qual time?");
                            imprimeTime(time,quantTime);
                            aux1=s.nextInt();
                            s.nextLine();
                            for(i=0;i<quantTime;i++){
                                if(i==aux1){
                                    time[i].setFuncionario(comissao[p]);
                                }
                            }
                            p++;
                            System.out.println("Você deseja cadastrar outro funcionario? SIM ou NAO?");
                            auxiliar=s.nextLine();
                                }else{
                                    System.out.println("Não podemos mais criar partidas!");
                                break;
                                }
                    
                    
                    }while(auxiliar.equals("sim"));
                break;
            
            }  
               
        }while(!"sair".equals(op));
    }
}