package lp2.aula07.polimorfismo;

/**
 *
 * @author Cayque
 */
public class ContaCorrente extends Conta{
    private double limite;
    private double taxaManutencao;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    
    
    
    
}
