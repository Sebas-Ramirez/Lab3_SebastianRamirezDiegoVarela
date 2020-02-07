package lab3_sebastianramirezdiegovarela;
public class Cirujano extends Medico{
    private int numero_cirugias;

    public Cirujano() {
        super();
    }

    public Cirujano(int numero_cirugias) {
        this.numero_cirugias = numero_cirugias;
    }

    public int getNumero_cirugias() {
        return numero_cirugias;
    }

    public void setNumero_cirugias(int numero_cirugias) {
        this.numero_cirugias = numero_cirugias;
    }

    @Override
    public String toString() {
        return "Cirujano{" + "numero_cirugias=" + numero_cirugias + '}';
    }
    
}
