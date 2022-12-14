/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_danielycatalina;

public class Pokemon {
    String name;
    String type;
    double height;
    String ability;
    String growth;
    double weight;
    String evolution;
    String pokedex;

    public Pokemon(String name, String type, double height, String ability, String growth, double weight, String evolution, String Pokedex) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.ability = ability;
        this.growth = growth;
        this.weight = weight;
        this.evolution = evolution;
        this.pokedex = Pokedex;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public String getPokedex() {
        return pokedex;
    }

    public void setPokedex(String pokedex) {
        this.pokedex = pokedex;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
