package lp2.aula07.polimorfismo;
/**
 *
 * @author Cayque
 */
public class ClasseTeste {
    public static void main(String[] args){
        
        Gerente g1 = new Gerente();
        
        g1.setNome("Cayque Silva");
        g1.setCpf("1512565845");
        g1.setSalario(2000.0);
        g1.setSenha(123321);
        
        System.out.println("Nome: "+g1.getNome());
        System.out.println("Cpf: "+g1.getCpf());
        System.out.println("Salario: "+g1.getSalario());
        System.out.println("Senha: "+g1.getSenha());
        System.out.println("Autenticando: "+g1.autenticar(159658));
        
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        funcionario.setSalario(5000.0);
        controle.registra(funcionario);
        
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setSalario(1000.0);
        controle.registra(funcionario1);
        
        System.out.println(controle.getTotalDeBonificacoes());
        
     
    }
}
