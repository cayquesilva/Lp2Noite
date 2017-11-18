package lp2.aula10.exercicio01;

public enum TipoDia {
    DOMINGO(1,"Domingo"),SEGUNDA(2,"Segunda"),TERCA(3,"Terça"),QUARTA(4,"Quarta"),QUINTA(5,"Quinta"),SEXTA(6,"Sexta"),SABADO(7,"Sábado");
    
    private final int tipo;
    private final String dia;

    private TipoDia(int tipo, String dia) {
        this.tipo = tipo;
        this.dia = dia;
    }

    public int getTipo() {
        return tipo;
    }

    public String getDia() {
        return dia;
    }
    
    
    
    
    
}
