/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_danielcarrasco;

import java.util.Random;
import java.util.Scanner;

public class Lab7P1_DanielCarrasco {

    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Buenas");
        System.out.println("Ingrese el ejercicio al que quiere ir");
        System.out.println("----------Menu----------");
        System.out.println("1-.El Calamar Pablo");
        System.out.println("2-.Torre de control");
        System.out.println("3-.Salir");
        System.out.println("------------------------");
        int maxi = 10;
        int mini = 0;
        int random = new Random().nextInt((maxi - mini) + 1) + mini;
        int ejercicio = ninetales.nextInt();

        do {
            switch (ejercicio) {
                case 1:
                    Scanner nine = new Scanner(System.in);

                    System.out.println("Bienevenidx");
                    System.out.println("Ingrese el país de la lista que desea");
                    //Siempre tengo numeros pares en las "-"
                    System.out.println("-------Lista-------");
                    System.out.println("1-. España");
                    System.out.println("2-. Alemania");
                    System.out.println("3-. Costa Rica");
                    System.out.println("4-. Japon");
                    System.out.println("5-. Belgica");
                    System.out.println("6-. Croacia");
                    System.out.println("7-. Canada");
                    System.out.println("8-. Marruecos");
                    System.out.println("-------------------");
                    String seleccionUss = nine.nextLine();

                    Seleccion España = new Seleccion('E', "Espana", "Luis Enrique", 26, "Si", "Primero", 0);
                    Seleccion Alemania = new Seleccion('E', "Alemania", "Hansi Flick", 26, "Si", "Tercero", 0);
                    Seleccion CostaR = new Seleccion('E', "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarto", 0);
                    Seleccion Japon = new Seleccion('E', "Japon", "Hajime Moriyasu", 26, "No", "Segundo", 0);
                    Seleccion Belgica = new Seleccion('F', "Belgica", "Roberto Martinez", 26, "No", "Primero", 0);
                    Seleccion Croacia = new Seleccion('F', "Croacia", "Zlatko Dalic", 26, "No", "Segundo", 0);
                    Seleccion Canada = new Seleccion('F', "Canada", "John Herdman", 26, "No", "Cuarto", 0);
                    Seleccion Marruecos = new Seleccion('F', "Marruecos", "Walid Regragui", 26, "No", "Tercero", 0);

                    if (seleccionUss.equalsIgnoreCase("España")) {
                        
                        System.out.println("Usted elegio a " + España.getSelecccion());
                        System.out.println("Pertenece al grupo " + España.getGrupo());
                        System.out.println("Su director es " + España.getDirector());
                        System.out.println("Tiene un total de " + España.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + España.getMundial());
                        System.out.println("Su posicion es: " + España.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de España");
                    } else if (seleccionUss.equalsIgnoreCase("Costa Rica")) {
                        
                        System.out.println("Usted elegio a " + CostaR.getSelecccion());
                        System.out.println("Pertenece al grupo " + CostaR.getGrupo());
                        System.out.println("Su director es " + CostaR.getDirector());
                        System.out.println("Tiene un total de " + CostaR.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + CostaR.getMundial());
                        System.out.println("Su posicion es: " + CostaR.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Costa Rica");
                    } else if (seleccionUss.equalsIgnoreCase("Alemania")) {
                        
                        System.out.println("Usted elegio a " + Alemania.getSelecccion());
                        System.out.println("Pertenece al grupo " + Alemania.getGrupo());
                        System.out.println("Su director es " + Alemania.getDirector());
                        System.out.println("Tiene un total de " + Alemania.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Alemania.getMundial());
                        System.out.println("Su posicion es: " + Alemania.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Alemania");
                    } else if (seleccionUss.equalsIgnoreCase("Japon")) {
                        
                        System.out.println("Usted elegio a " + Japon.getSelecccion());
                        System.out.println("Pertenece al grupo " + Japon.getGrupo());
                        System.out.println("Su director es " + Japon.getDirector());
                        System.out.println("Tiene un total de " + Japon.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Japon.getMundial());
                        System.out.println("Su posicion es: " + Japon.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Japon");
                    } else if (seleccionUss.equalsIgnoreCase("Belgica")) {
                        
                        System.out.println("Usted elegio a " + Belgica.getSelecccion());
                        System.out.println("Pertenece al grupo " + Belgica.getGrupo());
                        System.out.println("Su director es " + Belgica.getDirector());
                        System.out.println("Tiene un total de " + Belgica.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Belgica.getMundial());
                        System.out.println("Su posicion es: " + Belgica.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Belgica");
                    } else if (seleccionUss.equalsIgnoreCase("Croacia")) {
                        
                        System.out.println("Usted elegio a " + Croacia.getSelecccion());
                        System.out.println("Pertenece al grupo " + Croacia.getGrupo());
                        System.out.println("Su director es " + Croacia.getDirector());
                        System.out.println("Tiene un total de " + Croacia.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Croacia.getMundial());
                        System.out.println("Su posicion es: " + Croacia.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Croacia");
                    } else if (seleccionUss.equalsIgnoreCase("Canada")) {
                        
                        System.out.println("Usted elegio a " + Canada.getSelecccion());
                        System.out.println("Pertenece al grupo " + Canada.getGrupo());
                        System.out.println("Su director es " + Canada.getDirector());
                        System.out.println("Tiene un total de " + Canada.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Canada.getMundial());
                        System.out.println("Su posicion es: " + Canada.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Canada");
                    } else if (seleccionUss.equalsIgnoreCase("Marruecos")) {
                        
                        System.out.println("Usted elegio a " + Marruecos.getSelecccion());
                        System.out.println("Pertenece al grupo " + Marruecos.getGrupo());
                        System.out.println("Su director es " + Marruecos.getDirector());
                        System.out.println("Tiene un total de " + Marruecos.getJugadores() + " convocados");
                        System.out.println("Ha ganado mundiales?: " + Marruecos.getMundial());
                        System.out.println("Su posicion es: " + Marruecos.getPosicion());
                        System.out.println("----------Se ha creado existosamente la seleccion de Marruecos");
                    } else {
                        System.out.println("Ingreso un pais invalido");
                    }
                    
                    if (España.getSelecccion().equalsIgnoreCase("España") || Alemania.getSelecccion().equalsIgnoreCase("Alemania")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        España.setGoles(randome);
                        Alemania.setGoles(randomf);
                        
                        if (España.getGoles()>Alemania.getGoles()){
                            System.out.println("España ha ganado con un total de: "+España.getGoles()+" a "+Alemania.getGoles());
                        }else if(España.getGoles()<Alemania.getGoles()){
                            System.out.println("Alemania ha ganado con un total de: "+Alemania.getGoles()+" a "+España.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    } else if (Japon.getSelecccion().equalsIgnoreCase("Japon") || CostaR.getSelecccion().equalsIgnoreCase("Costa Rica")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        Japon.setGoles(randome);
                        CostaR.setGoles(randomf);
                        
                        if (Japon.getGoles()>CostaR.getGoles()){
                            System.out.println("Japon ha ganado con un total de: "+Japon.getGoles()+" a "+CostaR.getGoles());
                        }else if(Japon.getGoles()<CostaR.getGoles()){
                            System.out.println("CostaR ha ganado con un total de: "+CostaR.getGoles()+" a "+Japon.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    } else if (Marruecos.getSelecccion().equalsIgnoreCase("Marruecos") || Belgica.getSelecccion().equalsIgnoreCase("Belgica")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        Marruecos.setGoles(randome);
                        Belgica.setGoles(randomf);
                        
                        if (Marruecos.getGoles()>Belgica.getGoles()){
                            System.out.println("Marruecos ha ganado con un total de: "+Marruecos.getGoles()+" a "+Belgica.getGoles());
                        }else if(Japon.getGoles()<CostaR.getGoles()){
                            System.out.println("Belgica ha ganado con un total de: "+Belgica.getGoles()+" a "+Marruecos.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    } else if (Croacia.getSelecccion().equalsIgnoreCase("Croacia") || Canada.getSelecccion().equalsIgnoreCase("Canada")) {
                        int maxe = 10;
                        int mine = 0;
                        int randome = new Random().nextInt((maxe - mine) + 1) + mini;

                        int maxf = 10;
                        int minf = 0;
                        int randomf = new Random().nextInt((maxf - minf) + 1) + mini;

                        Croacia.setGoles(randome);
                        Canada.setGoles(randomf);
                        
                        if (Croacia.getGoles()>Canada.getGoles()){
                            System.out.println("Croacia ha ganado con un total de: "+Croacia.getGoles()+" a "+Canada.getGoles());
                        }else if(Japon.getGoles()<CostaR.getGoles()){
                            System.out.println("Canada ha ganado con un total de: "+Canada.getGoles()+" a "+Croacia.getGoles());
                        }else{
                            System.out.println("Empate");
                        }

                    }
                    //Veamos quien gana
                    
                    

                    System.out.println("Ingrese a que ejercicio quiere ir o 1 para ingresar otro país");
                    ejercicio = ninetales.nextInt();
                    break;
                case 2:
                    System.out.println("Bienvenidx al segundop ejercicio");
                    System.out.println("--------------------------------");
                    System.out.println("Ingrese el los datos para el primer avion");
                    Avion avionUno= new Avion( "modelo", 12222, 1999 , 200, 2000, "avioncito");

                    System.out.println("Ingrese a que ejercicio quiere ir");
                    ejercicio = ninetales.nextInt();
                    break;
                default:
                    ejercicio = 20;
                    System.out.println("Vuela pronto!!");

            }

        } while (ejercicio < 3);

    }
    
    /*                    System.out.println("Turo: Sin mas podemos comenzar, la profesora Sonia me esta ayudando en mis investigaciones en el foso de paldea");
                    System.out.println("Turo: Asi que nos trajo algunos pokemon de prestamo y yo añadire a mi Ferropaladin para que intentes algo con los pokemon paradox");
                    System.out.println("Turo: Suerte");
                    System.out.println("SmartRotom: Ingrese el pokemon de la lista que desea");
                    //Siempre tengo numeros pares en las "-"
                    System.out.println("-------Caja-------");
                    System.out.println("1-. Snorlax");
                    System.out.println("2-. Quagsire");
                    System.out.println("3-. Ninetales");
                    System.out.println("4-. Gengar");
                    System.out.println("5-. Ferropaladin");
                    System.out.println("6-. Skeledirge");
                    System.out.println("7-. Jigglypuff");
                    System.out.println("8-. Sylveon");
                    //Te puse a Jigglipuff y a Sylveon por que se sabe que te gustan jajaja

                    //System.out.println("9-. Braviary");
                    /*System.out.println("10-. Ferropaladin");
                    System.out.println("11-. Greedent");
                    System.out.println("12-. Lunala");
                    System.out.println("12-. ?????");*/
                    //System.out.println("------------------");
                    //int contadorP = 0;
                    //ArrayList<Object> Pokemones = new ArrayList();
                    //ArrayList<Object> PokemonesDos = new ArrayList();
                    
                    //Me gusta dejar mis errores por que se nota el proceso del programa
                    //Pokemon Snorlax = new Pokemon("", 0, 0, 0);
                    //Pokemon Quagsire = new Pokemon("", 0, 0, 0);
                    //Pokemon Ninetales = new Pokemon("", 0, 0, 0);
                    //Pokemon Gengar = new Pokemon("", 0, 0, 0);
                    //Pokemon Ferropaladin = new Pokemon("", 0, 0, 0);
                    //Pokemon Skeledirge = new Pokemon("", 0, 0, 0);
                    //Pokemon Jigglypuff = new Pokemon("", 0, 0, 0);
                    //Pokemon Sylveon = new Pokemon("", 0, 0, 0);
                    /*Pokemones.add(Snorlax);
                    Pokemones.add(Quagsire);
                    Pokemones.add(Ninetales);
                    Pokemones.add(Gengar);*/

                    /*System.out.println("Recuerde que no puede ingresar un valor mayor  300 ni en ataque ni en vida");
                    System.out.println("Ingrese sus pokemon entrenador uno");
                    do {
                        Scanner ninet = new Scanner(System.in);
                        int ataque = 0;
                        int vidaa = 0;
                        System.out.println("Ingrese el numero de su primer pookemon");
                        int pokes = ninet.nextInt();
                        if (pokes == 1) {
                            Pokemon Snorlax = new Pokemon("", 0, 0, 0);
                            Snorlax.setPokemon("Snorlax");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Snorlax.setAtc(ataque);
                                Snorlax.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Snorlax.setSuerte(random);
                            Pokemones.add(Snorlax);
                        } else if (pokes == 2) {
                            Pokemon Quagsire = new Pokemon("", 0, 0, 0);
                            Quagsire.setPokemon("Quagsire");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Quagsire.setAtc(ataque);
                                Quagsire.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Quagsire.setSuerte(random);
                            Pokemones.add(Quagsire);
                        } else if (pokes == 3) {
                            Pokemon Ninetales = new Pokemon("", 0, 0, 0);
                            Ninetales.setPokemon("Ninetales");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Ninetales.setAtc(ataque);
                                Ninetales.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Ninetales.setSuerte(random);
                            Pokemones.add(Ninetales);
                        } else if (pokes == 4) {
                            Pokemon Gengar = new Pokemon("", 0, 0, 0);
                            Gengar.setPokemon("Gengar");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Gengar.setAtc(ataque);
                                Gengar.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorrecto en ataque o vida");
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Gengar.setSuerte(random);
                            Pokemones.add(Gengar);
                        } else if (pokes == 5) {
                            Pokemon Ferropaladin = new Pokemon("", 0, 0, 0);
                            Ferropaladin.setPokemon("Ferropaladin");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Ferropaladin.setAtc(ataque);
                                Ferropaladin.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Ferropaladin.setSuerte(random);
                            Pokemones.add(Ferropaladin);
                        } else if (pokes == 6) {
                            Pokemon Skeledirge = new Pokemon("", 0, 0, 0);
                            Skeledirge.setPokemon("Skeledirge");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Skeledirge.setAtc(ataque);
                                Skeledirge.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Skeledirge.setSuerte(random);
                            Pokemones.add(Skeledirge);
                        } else if (pokes == 7) {
                            Pokemon Jigglypuff = new Pokemon("", 0, 0, 0);
                            Jigglypuff.setPokemon("Jigglypuff");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Jigglypuff.setAtc(ataque);
                                Jigglypuff.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Jigglypuff.setSuerte(random);
                            Pokemones.add(Jigglypuff);
                        } else if (pokes == 8) {
                            Pokemon Sylveon = new Pokemon("", 0, 0, 0);
                            Sylveon.setPokemon("Sylveon");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = ninet.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = ninet.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Sylveon.setAtc(ataque);
                                Sylveon.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Sylveon.setSuerte(random);
                            Pokemones.add(Sylveon);
                        }

                        contadorP++;

                    } while (contadorP < 3);
                    //No sé si sea necesario pero quise hacerlo así para evitarme problemas
                    //COMENTARIO PARA NO PERDERME
                    //
                    //
                    //
                    System.out.println("Recuerde que no puede ingresar un valor mayor  300 ni en ataque ni en vida");
                    System.out.println("Ingrese sus pokemon entrenador uno");
                    do {
                        Scanner nineta = new Scanner(System.in);
                        int ataque = 0;
                        int vidaa = 0;
                        System.out.println("Ingrese el numero de su primer pookemon");
                        int pokes = nineta.nextInt();
                        if (pokes == 1) {
                            Pokemon Snorlax = new Pokemon("", 0, 0, 0);
                            Snorlax.setPokemon("Snorlax");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Snorlax.setAtc(ataque);
                                Snorlax.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Snorlax.setSuerte(random);
                            PokemonesDos.add(Snorlax);
                        } else if (pokes == 2) {
                            Pokemon Quagsire = new Pokemon("", 0, 0, 0);
                            Quagsire.setPokemon("Quagsire");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Quagsire.setAtc(ataque);
                                Quagsire.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Quagsire.setSuerte(random);
                            PokemonesDos.add(Quagsire);
                        } else if (pokes == 3) {
                            Pokemon Ninetales = new Pokemon("", 0, 0, 0);
                            Ninetales.setPokemon("Ninetales");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Ninetales.setAtc(ataque);
                                Ninetales.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Ninetales.setSuerte(random);
                            PokemonesDos.add(Ninetales);
                        } else if (pokes == 4) {
                            Pokemon Gengar = new Pokemon("", 0, 0, 0);
                            Gengar.setPokemon("Gengar");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Gengar.setAtc(ataque);
                                Gengar.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorrecto en ataque o vida");
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Gengar.setSuerte(random);
                            PokemonesDos.add(Gengar);
                        } else if (pokes == 5) {
                            Pokemon Ferropaladin = new Pokemon("", 0, 0, 0);
                            Ferropaladin.setPokemon("Ferropaladin");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Ferropaladin.setAtc(ataque);
                                Ferropaladin.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Ferropaladin.setSuerte(random);
                            PokemonesDos.add(Ferropaladin);
                        } else if (pokes == 6) {
                            Pokemon Skeledirge = new Pokemon("", 0, 0, 0);
                            Skeledirge.setPokemon("Skeledirge");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Skeledirge.setAtc(ataque);
                                Skeledirge.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Skeledirge.setSuerte(random);
                            PokemonesDos.add(Skeledirge);
                        } else if (pokes == 7) {
                            Pokemon Jigglypuff = new Pokemon("", 0, 0, 0);
                            Jigglypuff.setPokemon("Jigglypuff");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Jigglypuff.setAtc(ataque);
                                Jigglypuff.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Jigglypuff.setSuerte(random);
                            PokemonesDos.add(Jigglypuff);
                        } else if (pokes == 8) {
                            Pokemon Sylveon = new Pokemon("", 0, 0, 0);
                            Sylveon.setPokemon("Sylveon");
                            System.out.println("Ingrese el ataque de su pokemon");
                            ataque = nineta.nextInt();
                            System.out.println("Ingrese la vida");
                            vidaa = nineta.nextInt();
                            if (ataque <= 300 || vidaa <= 300) {
                                Sylveon.setAtc(ataque);
                                Sylveon.setVida(vidaa);
                            } else {
                                System.out.println("Ingresaste un valor incorreto en ataque o vida, saliendo del menu");
                                contadorP = 20;
                            }
                            int maxi = 10;
                            int mini = 0;
                            int random = new Random().nextInt((maxi - mini) + 1) + mini;
                            Sylveon.setSuerte(random);
                            PokemonesDos.add(Sylveon);
                        }

                        contadorP++;

                    } while (contadorP < 3);
                    
                    do{
                        
                    }while (Pokemones.get(Snorlax.getVida()));
                    
*/

}
