package lp2.aula10.exercicio01;

public enum MesesAno {
    JAN(1,"Janeiro"),FEV(2,"Fevereiro"),MAR(3,"Março"),
    ABR(4,"Abril"),MAI(5,"Maio"),JUN(6,"Junho"),JUL(7,"Julho"),
    AGO(8,"Agosto"),SET(9,"Setembro"),OUT(10,"Outubro"),
    NOV(11,"Novembro"),DEZ(12,"Dezembro");
    
    private final int tipo;
    private final String nome;

    private MesesAno(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
