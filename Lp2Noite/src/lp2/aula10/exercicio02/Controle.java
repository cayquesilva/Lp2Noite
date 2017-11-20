package lp2.aula10.exercicio02;

public class Controle {
    
    private String s;
    private char flag;
    private int caracteres;
    private int palavras, vogais=0, digitos=0;
    private String[] dividido;
    private boolean palindrome;

    
    public String getString() {
        return s;
    }

    public void setString(String s) {
        this.s = s;
    }

    public int getCaracteres(String s) {
        caracteres=s.length();
        return caracteres;
    }

    public int getPalavras(String s) {
        
        dividido=s.split(" ");
        palavras=dividido.length;
        return palavras;
    }
   
    public boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=0;j--){
                if(s.charAt(i)==s.charAt(j)){
                    palindrome=true;
                }else{
                    palindrome=false;
                }
            }
        }
        return palindrome;
    }
    
    public int getVogais(String s){
       for(int i=0;i<s.length();i++){
            flag=s.charAt(i);
            if(flag ==  'a' ){
               vogais+=1;
            }else{
               if(flag ==  'e' ){
               vogais+=1;
               }else{
                    if(flag ==  'i' ){
                    vogais+=1;
                    }else{
                        if(flag ==  'o' ){
                        vogais+=1;
                        }else{
                            if(flag ==  'u' ){
                            vogais+=1;
                            }   
                        }
                    }
                }
            }
        }
    return vogais;   
    }

    public int getDigitos(String s) {
        for(int i=0;i<s.length();i++){
            flag=s.charAt(i);
            if(flag ==  '0' ){
               digitos+=1;
            }else{
               if(flag ==  '1' ){
               digitos+=1;
               }else{
                if(flag ==  '2' ){
                digitos+=1;
                }else{
                    if(flag ==  '3' ){
                    digitos+=1;
                    }else{
                        if(flag ==  '4' ){
                        digitos+=1;
                        }else{
                            if(flag ==  '5' ){
                            digitos+=1;
                            }else{
                                if(flag ==  '6' ){
                                digitos+=1;
                                }else{
                                    if(flag ==  '7' ){
                                    digitos+=1;
                                    }else{
                                        if(flag ==  '8' ){
                                        digitos+=1;
                                        }else{
                                            if(flag ==  '9' ){
                                            digitos+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }   
                        }
                    }
                }
            }
        }
        return digitos;
    }
   
   
   
}
