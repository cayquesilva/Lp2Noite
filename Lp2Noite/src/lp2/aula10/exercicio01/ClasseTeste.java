package lp2.aula10.exercicio01;

public class ClasseTeste {
    
    public static void main(String[] args) {
        Dia d =new Dia(TipoDia.SEGUNDA);
        Modalidade m = new Modalidade(TipoEsporte.FUTEBOL);
        Meses me = new Meses(MesesAno.JAN);
        System.out.println(d);
        System.out.println(m);
        System.out.println(me);
    }

}
