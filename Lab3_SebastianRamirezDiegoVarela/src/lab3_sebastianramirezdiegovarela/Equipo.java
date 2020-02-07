/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sebastianramirezdiegovarela;

import java.util.ArrayList;
import java.util.Date;


public class Equipo {
private String nombre;
private Date creacion;
private int campeonatos;
ArrayList<Persona> personal=new ArrayList();
private Dueño owner;
    ArrayList<Jugadas>listajug=new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, Date creacion, int campeonatos, Dueño owner) {
        this.nombre = nombre;
        this.creacion = creacion;
        this.campeonatos = campeonatos;
        this.owner = owner;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public ArrayList<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Persona> personal) {
        this.personal = personal;
    }

    public Dueño getOwner() {
        return owner;
    }

    public void setOwner(Dueño owner) {
        this.owner = owner;
    }

    public ArrayList<Jugadas> getListajug() {
        return listajug;
    }

    public void setListajug(ArrayList<Jugadas> listajug) {
        this.listajug = listajug;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", creacion=" + creacion + ", campeonatos=" + campeonatos + ", personal=" + personal + ", owner=" + owner + ", listajug=" + listajug + '}';
    }
    
}
