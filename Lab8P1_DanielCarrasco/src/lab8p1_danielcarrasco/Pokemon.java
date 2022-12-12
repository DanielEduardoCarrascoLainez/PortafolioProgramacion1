/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_danielcarrasco;

public class Pokemon {
    String pokemon;
    int vida;
    int atc;
    int suerte;

    public Pokemon(String pokemon, int vida, int atc, int suerte) {
        this.pokemon = pokemon;
        this.vida = vida;
        this.atc = atc;
        this.suerte = suerte;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtc() {
        return atc;
    }

    public void setAtc(int atc) {
        this.atc = atc;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }
    
    

    
}
