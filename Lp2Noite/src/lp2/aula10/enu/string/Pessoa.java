package lp2.aula10.enu.string;

// Se o final é utilizado em classe, ela não poderar ser extendida
// Se o final for em método, ele não poderá ser sobrescrito nas subclasses (@Override).

public class Pessoa {
    
                    // não está sendo usado, pois aplicou-se um "enum" no projeto.
// final static int PESSOA_FISICA = 1;  // final, impede que o atributo seja alterado
// final static int PESSOA_JURIDICA = 2; // No caso, faz da variável uma constante
                    //O static é utilizado para que o atributo seja da classe, 
                    //e não de cada objeto instanciado. Dessa forma, economiza-se espaço, pois não será
                    //criado uma variavel para cada objeto.
    
    private String nome;
    private TipoPessoa tipo;

    public Pessoa(String nome, TipoPessoa tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", tipo=" + tipo.getNome() + ", valor numerico="+
                tipo.getTipo()+'}';
    }

    
    
}
