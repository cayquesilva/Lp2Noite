package lp2.aula09.trows;

public class ClasseTeste {
    public static void main(String[] args){
        
        Gerente g1 = new Gerente("Cayque Silva");
        
       // g1.setNome("Cayque Silva"); não precisa pois tem o argumento no construtor.
        g1.setCpf("10152269495");
        g1.setSalario(2000.0);
        g1.setSenha(123321);
        
        System.out.println("Nome: "+g1.getNome());
        System.out.println("Cpf: "+g1.getCpf());
        System.out.println("Salario: "+g1.getSalario());
        System.out.println("Senha: "+g1.getSenha());
        System.out.println("Autenticando: "+g1.autentica(159658));
        
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Gerente gerente = new Gerente("Marcos Paulo");
        Funcionario funcionario = gerente;
        funcionario.setSalario(5000.0);
        controle.registra(funcionario);
        
        Funcionario funcionario1 = new Funcionario("Silvano Sales");
        funcionario1.setSalario(1000.0);
        controle.registra(funcionario1);
       
        
        System.out.println(controle.getTotalDeBonificacoes());
        if(funcionario1.validaCpf(funcionario1.getCpf())){
            System.out.println("Validado");
        }else{
            System.out.println("Invalido");
        }
        
     
    }
}
