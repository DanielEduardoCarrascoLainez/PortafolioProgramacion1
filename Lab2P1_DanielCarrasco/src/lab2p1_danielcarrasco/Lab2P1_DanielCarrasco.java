/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_danielcarrasco;

import java.util.Scanner;
public class Lab2P1_DanielCarrasco {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner numeroA = new Scanner (System.in);
        Scanner numeroB = new Scanner (System.in);
        Scanner generaciones = new Scanner (System.in);
        Scanner pokeAt = new Scanner (System.in);
        Scanner pokeDef = new Scanner (System.in);
        //DC
        //Dejo todos los int separados por que me enrredo y me da ansiedad :|
        int nA, nB;
        int ops;
        int gens;
        int pokeA;
        int pokeD;
        
        do{
        System.out.println("----------Menu----------");
        System.out.println("1-. ejercicio 1");
        System.out.println("2-. ejercicio 2");
        System.out.println("3-. ejercicio 3");
        System.out.println("4-.Salir");
        System.out.println("------------------------");
        System.out.println("Ingrese la opcion que desea: ");
        ops=entrada.nextInt();
        
        if (ops==1){
            //Ejercicio 1
            System.out.println("Bienvenidx al ejercicio 1");
            System.out.println("Ingresa el primer numero");
            nA=numeroA.nextInt();
            System.out.println("Ingresa el segundo numero");
            nB=numeroB.nextInt();
            //Inicio del 1
            if (nA==0 || nB==0){
                nA=0;
                nB=0;
                System.out.println("Ingrese un positivo");
            }else {
            do{
                if (nA>nB){
                    nA=nA-nB;
                }else{
                   nB= nB-nA;
                           
                }
            }while(nA>nB || nA<nB);
            System.out.println("El MCD es:"+ nB);
            }
        }else if (ops==2){
            //Ejercicio 2
            System.out.println("Bienvenidx al ejercicio 2");
            System.out.println("Ingresa cuando naciste porfa: ");
            gens=generaciones.nextInt();
            //Gens inicio
                if (gens>=2013&&gens<=2025){
                    //Gen Alpha
                    System.out.println("Neni sos gen alpha, que miedo siguen haciendo niños");
                }else if (gens>=1995&&gens<=2012){
                    //Gen z
                    System.out.println("OMG, sos gen z igual que yo, chocalas");
                }else if (gens>=1986&&gens<=1994){
                    //Gen Millenials
                    System.out.println("Uy millenial, felicidades :D");
                }else if (gens>=1980&&gens<=1985){
                    //Gen Xennials
                    System.out.println("Un gen xennial, mucho gusto");
                }else if (gens>=1965&&gens<=1979){
                    //Gen X
                    System.out.println("Gen x? wow felicidades");
                }else if (gens>=1946&&gens<=1964){
                    //Gen baby bomer
                    System.out.println("Karen? digo...Baby boomer? wow");
                }else{
                    System.out.println("Creo que tu gen aun no esta definida, sorry");
                }
            //Gens final
            //Fin del segundo ejercicio
        }else if (ops==3){
            //Ejercicio 3
            System.out.println("Bienvenidx al ejercicio 3");
            System.out.println("Prof Oak: Hola, eres un chico o una chica? nah mentira, venga iniciemos");
            System.out.println("A continuacion te doy las instrucciones");
            System.out.println("1-. es lucha");
            System.out.println("2-. es Psiquico");
            System.out.println("3-. es Acero");
            System.out.println("4-. es Hada");
            System.out.println("Ingresa tu atacante");
            pokeA=pokeAt.nextInt();
            System.out.println("Ingresa el defensor");
            pokeD=pokeDef.nextInt();
            //Batle
            if (pokeA==1&&pokeD==1){
                //Lucha y Lucha
                System.out.println("Ha sido neutral");
            }else if (pokeA==1&&pokeD==2){
                //Lucha y Psiquico
                System.out.println("No ha sido muy eficaz");
            }else if (pokeA==1&&pokeD==3){
                //Lucha y Acero
                System.out.println("Super eficaz!! Agron se ha debilitado");
            }else if (pokeA==1&&pokeD==4){
                //Lucha y Hada
                System.out.println("No ha sido muy eficaz");
            }else if (pokeA==2&&pokeD==1){
                //Psiquico y Lucha
                System.out.println("Super eficaz!! Hitmonlee se ha debilitado");
            }else if (pokeA==2&&pokeD==2){
                //Psiquico y Psiquico
                System.out.println("No ha sido muy eficaz");
            }else if (pokeA==2&&pokeD==3){
                //Psiquico y Acero
                System.out.println("No ha sido muy eficaz");
            }else if (pokeA==2&&pokeD==4){
                //Psiquico y Hada
                System.out.println("Ha sido neutral");
            }else if (pokeA==3&&pokeD==1){
                //Acero y Lucha
                System.out.println("Ha sido neutral");
            }else if (pokeA==3&&pokeD==2){
                //Acero y Psiquico
                System.out.println("Ha sido neutral");
            }else if (pokeA==3&&pokeD==3){
                //Acero y Acero
                System.out.println("No ha sido muy eficaz");
            }else if (pokeA==3&&pokeD==4){
                //Acero y Hada
                System.out.println("Ha sido super eficaz!! Xerneas se ha debilitado");
            }else if (pokeA==4&&pokeD==1){
                //Hada y Lucha
                System.out.println("Ha sido super eficaz!! Mienshao se ha debilitado");
            }else if (pokeA==4&&pokeD==2){
                //Hada y Psiquico
                System.out.println("Ha sido neutral");
            }else if (pokeA==4&&pokeD==3){
                //Hada y Acero
                System.out.println("No ha sido muy eficaz");
            }else if (pokeA==4&&pokeD==4){
                //Hada y Hada
                System.out.println("Ha sido neutral");
            }else{
                System.out.println("Creo que no entendiste el juego...ve al menu principal.");
            }
            
        }else{
            //Salida
            System.out.println("Bye bye :D");
        }
        
        }while(ops==1||ops==2||ops==3);
        
    }
    
}
