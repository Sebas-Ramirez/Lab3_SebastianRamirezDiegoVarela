package lab3_sebastianramirezdiegovarela;
public class Terapeuta extends Medico{
    private int numero_terapias;
    
    public Terapeuta() {
    }
    
    public Terapeuta(int numero_terapias) {
        this.numero_terapias = numero_terapias;
    }

    public int getNumero_terapias() {
        return numero_terapias;
    }

    public void setNumero_terapias(int numero_terapias) {
        this.numero_terapias = numero_terapias;
    }

    @Override
    public String toString() {
        return "Terapeuta{" + "numero_terapias=" + numero_terapias + '}';
    }
    
        
}
