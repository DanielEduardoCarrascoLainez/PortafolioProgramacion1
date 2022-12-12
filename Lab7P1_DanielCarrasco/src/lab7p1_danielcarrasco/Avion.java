/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_danielcarrasco;


public class Avion {
    String modelo;
    int codigo;
    int anio;
    int capMax;
    int peso;
    String nombreA;

    public Avion(String modelo, int codigo, int anio, int capMax, int peso, String nombreA) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.anio = anio;
        this.capMax = capMax;
        this.peso = peso;
        this.nombreA = nombreA;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }
    
    
}
