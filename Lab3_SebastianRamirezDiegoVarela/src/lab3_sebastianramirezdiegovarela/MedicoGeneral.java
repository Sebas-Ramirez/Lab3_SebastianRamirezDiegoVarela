package lab3_sebastianramirezdiegovarela;
public class MedicoGeneral extends Medico {
    private int numero_enfermedades;

    public MedicoGeneral() {
        super();
    }

    public MedicoGeneral(int numero_enfermedades) {
        this.numero_enfermedades = numero_enfermedades;    
    }

    public int getNumero_enfermedades() {
        return numero_enfermedades;
    }

    public void setNumero_enfermedades(int numero_enfermedades) {
        this.numero_enfermedades = numero_enfermedades;
    }

    @Override
    public String toString() {
        return "MedicoGeneral{" + "numero_enfermedades=" + numero_enfermedades + '}';
    }
    
}
