package lp2.aula10.enu.string;

public enum TipoPessoa {  //enum são constantes no java.
    PESSOA_FISICA(1,"Pessoa Física"), PESSOA_JURIDICA(2,"Pessoa Jurídica");
    
    private final int tipo;
    private final String nome;

    private TipoPessoa(int tipo, String nome) {
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
