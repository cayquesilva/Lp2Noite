package lp2.aula08.classeabstrata;
/**
 *
 * @author Cayque
 */
public class Gerente extends Funcionario implements Autenticavel{
    private int senha;

    public Gerente (String nome){
        super(nome);
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    @Override
    public double getBonificacao(){
        return super.getBonificacao()+1000; //o salario do gerente te bonus +1000 além da porcentagem"bonus" 
    }
    

    @Override
    public boolean autentica(int senha) {
       if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    
    
}
