package lab3_sebastianramirezdiegovarela;
public class Medico extends Persona{
    private String colegio;

    public Medico() {
    }

    public Medico(String colegio) {
        this.colegio = colegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Medico{" + "colegio=" + colegio + '}';
    }
    
}
