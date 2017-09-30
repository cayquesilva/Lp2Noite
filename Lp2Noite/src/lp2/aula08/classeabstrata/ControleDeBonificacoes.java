package lp2.aula08.classeabstrata;
/**
 *
 * @author Cayque
 */
public class ControleDeBonificacoes {
    private double totalDeBonificacoes=0;
    
    public void registra(Funcionario funcionario){ // Set bonificação / 
        this.totalDeBonificacoes+=funcionario.getBonificacao();
    } //Usando polimorfismo, acessando metodo getBonificacao() de funcionario, porém
    // funcionario está referenciando um endereço de um construtor da classe Gerente.
    // so funciona pq o metodo getBonificacao() está tanto em funcionario como em gerente.
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
    
}
