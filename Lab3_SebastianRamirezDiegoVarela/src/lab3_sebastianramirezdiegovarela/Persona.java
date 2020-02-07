package lab3_sebastianramirezdiegovarela;

public class Persona {
    private String nombre,apellido;
    private int años_profesional,salario;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int años_profesional, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.años_profesional = años_profesional;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAños_profesional() {
        return años_profesional;
    }

    public void setAños_profesional(int años_profesional) {
        this.años_profesional = años_profesional;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1os_profesional=" + años_profesional + ", salario=" + salario + '}';
    }
    
}
