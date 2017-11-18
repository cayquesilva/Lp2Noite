package lp2.aula10.exercicio01;

public enum TipoEsporte {
    FUTEBOL(1,"Futebol"),NATACAO(2,"Natação"),BASQUETE(3,"Basquete");
    
    private final int tipo;
    private final String nome;

    private TipoEsporte(int tipo, String nome) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
