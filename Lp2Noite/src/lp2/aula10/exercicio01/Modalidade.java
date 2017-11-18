package lp2.aula10.exercicio01;

public class Modalidade {
    
    private TipoEsporte tipoesporte;

    public Modalidade(TipoEsporte tipoesporte) {
        this.tipoesporte = tipoesporte;
    }

    public TipoEsporte getTipoesporte() {
        return tipoesporte;
    }

    @Override
    public String toString() {
        return "Modalidade{" + "tipoesporte=" + tipoesporte + ", nome=" + tipoesporte.getNome() + ", valor="+tipoesporte.getTipo()+'}';
    }
    
    
    
}
