/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_danielcarrasco;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab8P1_DanielCarrasco {

    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Bienvenidx");
        System.out.println("Ingrese el ejercicio al que quiere ir");
        System.out.println("----------Menu----------");
        System.out.println("1-.Pokemon Violet");
        System.out.println("2-.DC v.s Marvel");
        System.out.println("3-.Salir");
        System.out.println("------------------------");
        int ejercicio = ninetales.nextInt();
        //Solo funciona en 1 vs 1 creo pero no estoy seguro :(

        do {

            switch (ejercicio) {

                case 1:
                    Scanner nine = new Scanner(System.in);
                    int contador = 0;
                    int contadorD= 0;
                    System.out.println("Turo: Bienevenidx entrenadores pokemon, este es el proceso de simulacion del profesor Turo");
                    System.out.println("Turo: Espero disfrutes la experiencia por que quien programo esto seguro no lo hizo");
                    ArrayList<Pokemon> PokemonesUno = new ArrayList();
                    ArrayList<Pokemon> PokemonesDos = new ArrayList();
                    
                    do {
                        Scanner ninet = new Scanner(System.in);
                        System.out.println("Ingrese el nombre de su pokemon entrenador uno: ");
                        String poke = ninet.nextLine();
                        System.out.println("Ingrese la vida de su pokemon");
                        int vidas = ninet.nextInt();
                        while (vidas > 300) {
                            System.out.println("Ingrese la vida de su pokemon correctamente");
                            vidas = ninet.nextInt();
                        }
                        System.out.println("Ingrese el ataque de su pokemon");
                        int ataque = ninet.nextInt();
                        int maxi = 5;
                        int mini = 1;
                        int random = new Random().nextInt((maxi - mini) + 1) + mini;
                        Pokemon Pokes = new Pokemon(poke, vidas, ataque, random);
                        PokemonesUno.add(Pokes);
                        System.out.println("Desea agregar mas pokemon? 1 para si y 2 para no");
                        int resp = ninetales.nextInt();
                        if (resp == 2) {
                            contador = 20;
                        } else {
                            contador++;
                        }

                    } while (contador < 3);

                    do {
                        System.out.println("Ingrese el nombre de su pokemon entrenador dos: ");
                        String poke = nine.nextLine();
                        System.out.println("Ingrese la vida de su pokemon");
                        int vidas = nine.nextInt();
                        System.out.println("Ingrese el ataque de su pokemon");
                        int ataque = nine.nextInt();
                        int maxi = 5;
                        int mini = 1;
                        int random = new Random().nextInt((maxi - mini) + 1) + mini;
                        Pokemon Pokes = new Pokemon(poke, vidas, ataque, random);
                        PokemonesDos.add(Pokes);
                        System.out.println("Desea agregar mas pokemon? 1 para si y 2 para no");
                        int respu = ninetales.nextInt();
                        if (respu == 2) {
                            contadorD = 20;
                        } else {
                            contadorD++;
                        }

                    } while (contadorD < 3);

                    boolean flagPelea = true;
                    if (PokemonesUno.size() <= 0) {
                        System.out.println("Ya no te quedan pokemon jugador uno!!");
                        flagPelea = false;
                    } else if (PokemonesDos.size() <= 0) {
                        System.out.println("Ya no te quedan pokemon jugador dos!!");
                        flagPelea = false;
                    }
                    while (flagPelea == true) {
                        Pokemon poke1;
                        Pokemon poke2;
                        poke1 = PokemonesUno.get(0);
                        poke2 = PokemonesDos.get(0);
                        Combate(poke1, poke2);
                        

                        if (poke1.getVida() <= 0) {
                            PokemonesUno.remove(0);
                            System.out.println("Tu pokemon ya no puede continuar J1");
                        }
                        if (poke2.getVida() <= 0) {
                            PokemonesDos.remove(0);
                            System.out.println("Tu pokemon ya no puede continuar J2");
                        }

                        if (PokemonesUno.size() <= 0) {
                            System.out.println("Perdiste jugador uno");
                            flagPelea = false;
                        } else if (PokemonesDos.size() <= 0) {
                            System.out.println("Perdiste jugador dos");
                            flagPelea = false;
                        }
                    }

                    System.out.println("Ingrese a que ejercicio quiere ir");
                    ejercicio = ninetales.nextInt();

                    break;
                //Caso2
                //PERDON NO QUIER SEGUIRME PERDIENDO
                //
                //
                //
                //EALE

                case 2:

                    break;
                default:
                    ejercicio = 20;

            }

        } while (ejercicio < 3);

    }

    public static void Combate(Pokemon poke1, Pokemon poke2) {
        int pelea=10;
        System.out.println("Los pokemon que salen son: "+poke1.getPokemon());
        System.out.println("Y :"+poke2.getPokemon());

        do {
            System.out.println("-----------------------------------");
            if (poke1.getSuerte() > poke2.getSuerte()) {
                System.out.println("Ataca primero el pokemon uno");
                poke2.setVida(poke2.getVida() - poke1.getAtc());
                System.out.println("Turno del otro pokemon");
                poke1.setVida(poke1.getVida() - poke2.getAtc());
            } else if (poke1.getSuerte() > poke2.getSuerte()) {
                System.out.println("Ataca primero el pokemon dos");
                poke1.setVida(poke2.getVida() - poke1.getAtc());
                System.out.println("Turno del otro pokemon");
                poke2.setVida(poke1.getVida() - poke2.getAtc());
            }else{
                System.out.println("Ataca primero el pokemon uno por suerte");
                poke2.setVida(poke2.getVida() - poke1.getAtc());
                System.out.println("Turno del otro pokemon");
                poke1.setVida(poke1.getVida() - poke2.getAtc());
            }
            if(poke1.getVida()<=0){
                pelea=0;
            }
            if(poke2.getVida()<=0){
                pelea=0;
            }
            System.out.println(poke1.getPokemon()+" tiene ahora "+poke1.getVida()+" de puntos de vida");
            System.out.println("");
            System.out.println(poke2.getPokemon()+" tiene ahora "+poke2.getVida()+" de puntos de vida");

            System.out.println("-----------------------------------");
        } while (pelea>6);
    }

}
