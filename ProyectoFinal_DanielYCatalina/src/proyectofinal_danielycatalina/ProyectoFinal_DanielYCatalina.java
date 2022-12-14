/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal_danielycatalina;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
//Este arraylist es para verse lindo, queeee

public class ProyectoFinal_DanielYCatalina {

    static Scanner ninetales = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner quaxly = new Scanner(System.in);
        System.out.println("Entrenador, puedes buscar Pokemones ya existentes dentro de la Pokedex o agregar nuevos que encuentres en tu aventura!");
        System.out.println("1. Buscar en la pokedex");
        System.out.println("2. Matriz de okis");
        System.out.println("3-. Redimiendo el Combate");
        int choice = ninetales.nextInt();

        do {

            switch (choice) {
                case 1:
                    Scanner quaxly = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del Pokemon que desea buscar: ");
                    String pokemon = quaxly.nextLine();

                    Pokemon Sprigatito = new Pokemon("Sprigatito", "Planta", 0.4, "Overgrow", "Medio", 4.1, "Floragato y Meowscarada", "El dulce aroma que desprende su cuerpo hipnotiza a quienes lo rodean. El olor se vuelve más fuerte cuando este Pokémon está al sol.");
                    Pokemon Fuecoco = new Pokemon("Fuecoco", "Fuego", 0.4, "Blaze", "Medio", 9.8, "Crocalor y Skeledirge", "Su saco de llamas es pequeño, por lo que la energía siempre se escapa. Esta energía se libera de la abolladura en la parte superior de la cabeza de Fuecoco y parpadea de un lado a otro.");
                    Pokemon Quaxly = new Pokemon("Quaxly", "Agua", 0.5, "Torrent", "Medio", 6.1, "Quaxwell y Quaquaval", "Sus fuertes patas le permiten nadar fácilmente incluso en ríos de corriente rápida. Le gusta mantener las cosas ordenadas y es propenso a pensar demasiado las cosas.");
                    Pokemon Maschiff = new Pokemon("Maschiff", "Siniestro", 0.5, "Intimidate y Run Away", "Medio", 16.0, "Mabosstiff", "Siempre frunce el ceño en un intento de hacer que los oponentes se lo tomen en serio, pero incluso los niños que lloran estallarán en carcajadas cuando vean la cara de Maschiff.");
                    Pokemon Finizen = new Pokemon("Finizen", "Agua", 1.3, "Water Veil", "Lento", 60.2, "Palafin", "Le gusta jugar con otros de su especie usando el anillo de agua que tiene en la cola. Utiliza ondas ultrasónicas para sentir las emociones de otros seres vivos.");
                    Pokemon Dodonzo = new Pokemon("Dodonzo", "Agua", 12.0, "Unaware", "Lento", 220.0, "no tiene una", "Este Pokémon es un glotón, pero es malo para conseguir comida. Se une a un Tatsugiri para atrapar presas.");
                    Pokemon Tatsugiri = new Pokemon("Tatsugiri", "Dragon y Agua", 0.3, "Commander", "Medio", 8.0, "no tiene una evolucion", "Este es un pequeño Pokémon dragón. Vive dentro de la boca de Dondozo para protegerse de los enemigos del exterior.");
                    Pokemon Koraidon = new Pokemon("Koraidon", "Lucha y Dragon", 2.5, "Orichalcum Pulse", "Lento", 303.0, "no tiene una evolucion", "Se desconoce la ecología y otros datos sobre este Pokémon. Fue nombrado Koraidon por el profesor que lo descubrió.");
                    Pokemon Miraidon = new Pokemon("Miraidon", "Dragon y Electrico", 3.5, "Hadron Engine", "Lento", 240.0, "no tiene una evolucion", "El profesor que lo descubrió le dio el nombre de Miraidon. Su ecología y otros detalles son desconocidos.");
                    Pokemon Wooper = new Pokemon("Wooper", "Agua y Tierra", 0.4, "Water Absorb", "Relativamente Rapido", 8.5, "Cloudsire", "It’s dangerous for Wooper to travel alone. They line up in groups of three or four and help each other as they walk around the wetlands.");

                    if (pokemon.equalsIgnoreCase("Sprigatito")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Sprigatito.getName());
                        System.out.println("El pokemon tipo:" + Sprigatito.getType());
                        System.out.println(Sprigatito.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Sprigatito.getEvolution());
                        System.out.println("Su ataque principal es: " + Sprigatito.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Sprigatito.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Sprigatito.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Sprigatito.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Fuecoco")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Fuecoco.getName());
                        System.out.println("El pokemon tipo:" + Fuecoco.getType());
                        System.out.println(Fuecoco.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Fuecoco.getEvolution());
                        System.out.println("Su ataque principal es: " + Fuecoco.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Fuecoco.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Fuecoco.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Fuecoco.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Quaxly")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Quaxly.getName());
                        System.out.println("El pokemon tipo:" + Quaxly.getType());
                        System.out.println(Sprigatito.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Quaxly.getEvolution());
                        System.out.println("Su ataque principal es: " + Quaxly.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Quaxly.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Quaxly.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Quaxly.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Maschiff")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Maschiff.getName());
                        System.out.println("El pokemon tipo:" + Maschiff.getType());
                        System.out.println(Maschiff.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Maschiff.getEvolution());
                        System.out.println("Su ataque principal es: " + Maschiff.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Maschiff.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Maschiff.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Maschiff.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Finizen")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Finizen.getName());
                        System.out.println("El pokemon tipo:" + Finizen.getType());
                        System.out.println(Finizen.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Finizen.getEvolution());
                        System.out.println("Su ataque principal es: " + Finizen.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Finizen.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Finizen.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Finizen.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Dodonzo")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Dodonzo.getName());
                        System.out.println("El pokemon tipo:" + Dodonzo.getType());
                        System.out.println(Dodonzo.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Dodonzo.getEvolution());
                        System.out.println("Su ataque principal es: " + Dodonzo.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Dodonzo.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Dodonzo.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Dodonzo.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Tatsugiri")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Tatsugiri.getName());
                        System.out.println("El pokemon tipo:" + Tatsugiri.getType());
                        System.out.println(Tatsugiri.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Tatsugiri.getEvolution());
                        System.out.println("Su ataque principal es: " + Tatsugiri.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Tatsugiri.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Tatsugiri.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Tatsugiri.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Koraidon")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Koraidon.getName());
                        System.out.println("El pokemon tipo:" + Koraidon.getType());
                        System.out.println(Koraidon.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Koraidon.getEvolution());
                        System.out.println("Su ataque principal es: " + Koraidon.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Koraidon.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Koraidon.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Koraidon.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Miraidon")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Miraidon.getName());
                        System.out.println("El pokemon tipo:" + Miraidon.getType());
                        System.out.println(Miraidon.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Miraidon.getEvolution());
                        System.out.println("Su ataque principal es: " + Miraidon.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Miraidon.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Miraidon.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Miraidon.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    if (pokemon.equalsIgnoreCase("Wooper")) {
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println(Wooper.getName());
                        System.out.println("El pokemon tipo:" + Wooper.getType());
                        System.out.println(Wooper.getPokedex());
                        System.out.println("Las evoluciones de este Pokemon son: " + Wooper.getEvolution());
                        System.out.println("Su ataque principal es: " + Wooper.getAbility());
                        System.out.println("Este Pokemon crece a un nivel: " + Wooper.getGrowth());
                        System.out.println("Este Pokemon mide (usualmente)" + Wooper.getHeight() + "m");
                        System.out.println("Este Pokemon pesa (usualmente)" + Wooper.getWeight() + "kg");
                        System.out.println("-----------------------------------------------------------------");
                    } else {
                        System.out.println("Oh no! Parece que aun no encuentras este Pokemon, Entrenador! Puedes agregarlo a la Pokedex si deseas hacerlo, aunque no tendra todo sus datos!");
                    }

                    System.out.println("Ingrese a que ejercicio quiere ir o 4 para salir");
                    choice = ninetales.nextInt();
                    break;
                case 2:
                    
                    boolean cosa=Bandera();
                    
                    if (cosa==true){
                        System.out.println("No teniamos return, si ves esto es por que funciona");
                    }else{
                        System.out.println("No funciono el return, mori");
                    }

                    System.out.println("Ingrese a que ejercicio quiere ir o 4 para salir");
                    choice = ninetales.nextInt();
                    break;
                case 3:
                    SimuladorC();

                    System.out.println("Ingrese a que ejercicio quiere ir o 4 para salir");
                    choice = ninetales.nextInt();
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;

            }

        } while (choice < 4);
        System.out.println("Vuelva pronto!!!");

    }

    public static boolean Bandera() {
        System.out.println("Bienvenidx a nuestra matriz de okis");
        System.out.println("Vamos a hacer figuritas, una pokeball bien bonita");
        char[][] pokemona = new char[6][6];
        pokemona[2][0] = '*';
        //pokemona[0][2] = '*';
        pokemona[1][1] = '*';
        pokemona[1][3] = '*';
        pokemona[2][4] = '*';
        pokemona[3][1] = '*';
        pokemona[3][3] = '*';
        //pokemona[4][2] = '*';
        pokemona[2][5] = '*';

        //Ahora los espacios en blanco
        pokemona[0][0] = ' ';
        pokemona[0][1] = ' ';
        pokemona[0][3] = ' ';
        pokemona[0][4] = ' ';
        pokemona[1][0] = ' ';
        pokemona[1][4] = ' ';
        pokemona[3][0] = ' ';
        pokemona[3][2] = ' ';
        pokemona[3][4] = ' ';
        pokemona[4][0] = ' ';
        pokemona[4][1] = ' ';
        pokemona[4][3] = ' ';
        pokemona[4][4] = ' ';
        pokemona[1][2] = ' ';

        //Ultima parte de la pokeball
        pokemona[2][1] = '=';
        pokemona[2][2] = '0';
        pokemona[2][3] = '=';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pokemona[i][j] + "");
            }
            System.out.println("");
        }
        boolean banderona=true;
        
        return banderona;
    }

    public static void SimuladorC() {
        Scanner nine = new Scanner(System.in);
        int contador = 0;
        int contadorD = 0;
        System.out.println("Turo: Durante uno de los labs Daniel y Catalina se estresaron horriblemente en algo que sabian podian hacer");
        System.out.println("Turo: Les costo mucho trabajo algo que en circustancias diferentes habría sido algo entretenido");
        System.out.println("Turo: De haber tenido el tiempo que tienen en estre proyecto seguro habrían entregado algo bueno");
        System.out.println("Turo: Veamos esto como una forma de redimirse ante un lab tan caotico");
        System.out.println("Turo: Sin mas podemos comezar.");
        ArrayList<Simulador> PokesJugadorU = new ArrayList();
        ArrayList<Simulador> PokesJugadorD = new ArrayList();

        do {
            Scanner ninet = new Scanner(System.in);
            System.out.println("Ingrese el nombre de su pokemon entrenador A: ");
            String poke = ninet.nextLine();
            System.out.println("Ingrese la vida/hp de su pokemon");
            int vidas = ninet.nextInt();
            while (vidas > 500) {
                System.out.println("Ingrese la vida de su pokemon correctamente");
                vidas = ninet.nextInt();
            }
            System.out.println("Ingrese el ataque de su pokemon");
            int ataque = ninet.nextInt();
            int max = 60;
            int min = 10;
            int velocidad = new Random().nextInt((max - min) + 1) + min;
            Simulador Pokes = new Simulador(poke, vidas, ataque, velocidad);
            PokesJugadorU.add(Pokes);
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
            Simulador Pokes = new Simulador(poke, vidas, ataque, random);
            PokesJugadorD.add(Pokes);
            System.out.println("Desea agregar mas pokemon? 1 para si y 2 para no");
            int respu = ninetales.nextInt();
            if (respu == 2) {
                contadorD = 20;
            } else {
                contadorD++;
            }

        } while (contadorD < 3);

        boolean flagPelea = true;
        if (PokesJugadorU.size() <= 0) {
            System.out.println("Ya no te quedan pokemon jugador uno!!");
            flagPelea = false;
        } else if (PokesJugadorD.size() <= 0) {
            System.out.println("Ya no te quedan pokemon jugador dos!!");
            flagPelea = false;
        }
        while (flagPelea == true) {
            Simulador poke1;
            Simulador poke2;
            poke1 = PokesJugadorU.get(0);
            poke2 = PokesJugadorD.get(0);
            Combate(poke1, poke2);

            if (poke1.getHp() <= 0) {
                PokesJugadorU.remove(0);
                System.out.println("Tu pokemon ya no puede continuar J1");
            }
            if (poke2.getHp() <= 0) {
                PokesJugadorD.remove(0);
                System.out.println("Tu pokemon ya no puede continuar J2");
            }

            if (PokesJugadorU.size() <= 0) {
                System.out.println("Perdiste jugador uno");
                flagPelea = false;
            } else if (PokesJugadorD.size() <= 0) {
                System.out.println("Perdiste jugador dos");
                flagPelea = false;
            }
        }
    }

    public static void Combate(Simulador poke1, Simulador poke2) {
        int soyAries = 10;
        System.out.println("Los pokemon que salen son: " + poke1.getPokemon());
        System.out.println("Y :" + poke2.getPokemon());
        System.out.println("La vida del pokemon 1 es de: " + poke1.getHp());
        System.out.println("La vida del pokemon 2 es de: " + poke2.getHp());

        do {
            System.out.println("-----------------------------------");
            if (poke1.getVelocidad() > poke2.getVelocidad()) {
                System.out.println("Ataca primero el pokemon uno pues es mas rapido");
                poke2.setHp(poke2.getHp() - poke1.getAtc());
                System.out.println("Turno del pokemon dos");
                poke1.setHp(poke1.getHp() - poke2.getAtc());
            } else if (poke1.getVelocidad() > poke2.getVelocidad()) {
                System.out.println("Ataca primero el pokemon dos pues es mas rapido");
                poke1.setHp(poke2.getHp() - poke1.getAtc());
                System.out.println("Turno del pokemon uno");
                poke2.setHp(poke1.getHp() - poke2.getAtc());
            } else {
                System.out.println("Ataca primero el pokemon uno por suerte");
                poke2.setHp(poke2.getHp() - poke1.getAtc());
                System.out.println("Turno del pokemon dos");
                poke1.setHp(poke1.getHp() - poke2.getAtc());
            }
            if (poke1.getHp() <= 0) {
                soyAries = 0;
            }
            if (poke2.getHp() <= 0) {
                soyAries = 0;
            }
            System.out.println(poke1.getPokemon() + " tiene ahora " + poke1.getHp() + " de puntos de vida");
            System.out.println("");
            System.out.println(poke2.getPokemon() + " tiene ahora " + poke2.getHp() + " de puntos de vida");

            System.out.println("-----------------------------------");
        } while (soyAries > 6);
    }

}
