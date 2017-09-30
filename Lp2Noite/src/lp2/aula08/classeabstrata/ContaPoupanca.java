package lp2.aula08.classeabstrata;
/**
 *
 * @author Cayque
 */
public class ContaPoupanca extends Conta{
    private double juros;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public void imprimeExtratoDetalhado() {
        
    }
    
    
}
