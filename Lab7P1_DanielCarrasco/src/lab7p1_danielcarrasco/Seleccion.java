/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_danielcarrasco;

/**
 *
 * @author Daniel
 */
public class Seleccion {
    char grupo;
    String selecccion;
    String director;
    int jugadores;
    String mundial;
    String posicion;
    int goles;
    public Seleccion() {
        
    }
    

    public Seleccion(char grupo, String selecccion, String director, int jugadores, String mundial, String posicion, int goles) {
        this.grupo = grupo;
        this.selecccion = selecccion;
        this.director = director;
        this.jugadores = jugadores;
        this.mundial = mundial;
        this.posicion = posicion;
        this.goles = goles;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public String getSelecccion() {
        return selecccion;
    }

    public void setSelecccion(String selecccion) {
        this.selecccion = selecccion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public String getMundial() {
        return mundial;
    }

    public void setMundial(String mundial) {
        this.mundial = mundial;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    
}
