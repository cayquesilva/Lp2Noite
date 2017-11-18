package lp2.aula10.exercicio01;

public class Meses {
    
    private MesesAno mes;

    public Meses(MesesAno mes) {
        this.mes = mes;
    }

    public MesesAno getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "Meses{" + "mes=" + mes.getTipo() + ", nome="+mes.getNome()+'}';
    }
    
    
}
