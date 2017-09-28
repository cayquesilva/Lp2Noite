package lp2.aula07.polimorfismo;
/**
 *
 * @author Cayque
 */
public class Gerente extends Funcionario{
    private int senha;


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
    
    public boolean autenticar(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    
    
}
