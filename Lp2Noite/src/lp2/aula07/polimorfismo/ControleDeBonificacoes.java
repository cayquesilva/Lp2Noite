package lp2.aula07.polimorfismo;
/**
 *
 * @author Cayque
 */
public class ControleDeBonificacoes {
    private double totalDeBonificacoes=0;
    
    public void registra(Funcionario funcionario){
        this.totalDeBonificacoes+=funcionario.getBonificacao();
    }
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
    
}
