package lp2.aula10.exercicio01;

public class Dia {
    private TipoDia tipodia;

    public Dia(TipoDia tipodia) {
        this.tipodia = tipodia;

    }

    public TipoDia getTipodia() {
        return tipodia;
    }
    
    @Override
    public String toString() {
        return "Dia{" + "tipodia=" + tipodia + ", dia=" + tipodia.getDia() + ", valor="+tipodia.getTipo()+'}';
    }
    
}
