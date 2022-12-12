/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_explicación_26_noviembre;


public class Pasteles {
    //El unico es el ingrediente especial que lleva cada pastel, uno de fresa no lleva lo mismo que uno de chocolate
    int azucar;
    int harina;
    int bicarbonato;
    int huevos;
    String unico;
    int mantequilla;
    int sal;
    int gotVainilla;
    int litLeche;

    public Pasteles(int azucar, int harina, int bicarbonato, int huevos, String unico, int mantequilla, int sal, int gotVainilla, int litLeche) {
        this.azucar = azucar;
        this.harina = harina;
        this.bicarbonato = bicarbonato;
        this.huevos = huevos;
        this.unico = unico;
        this.mantequilla = mantequilla;
        this.sal = sal;
        this.gotVainilla = gotVainilla;
        this.litLeche = litLeche;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getHarina() {
        return harina;
    }

    public void setHarina(int harina) {
        this.harina = harina;
    }

    public int getBicarbonato() {
        return bicarbonato;
    }

    public void setBicarbonato(int bicarbonato) {
        this.bicarbonato = bicarbonato;
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    public String getUnico() {
        return unico;
    }

    public void setUnico(String unico) {
        this.unico = unico;
    }

    public int getMantequilla() {
        return mantequilla;
    }

    public void setMantequilla(int mantequilla) {
        this.mantequilla = mantequilla;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getGotVainilla() {
        return gotVainilla;
    }

    public void setGotVainilla(int gotVainilla) {
        this.gotVainilla = gotVainilla;
    }

    public int getLitLeche() {
        return litLeche;
    }

    public void setLitLeche(int litLeche) {
        this.litLeche = litLeche;
    }
    
    
}
