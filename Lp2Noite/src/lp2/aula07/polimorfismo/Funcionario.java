package lp2.aula07.polimorfismo;
/**
 *
 * @author Cayque
 */
public class Funcionario {
    
    private String nome,cpf;
    private double salario,bonus=0.10;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    
    public double getBonificacao(){
        return this.salario * bonus;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
