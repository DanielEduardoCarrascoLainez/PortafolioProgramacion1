/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_danielcarrasco;

import java.util.Random;
import java.util.Scanner;

public class Lab6P1_DanielCarrasco {

    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Bienvenidx!");
        System.out.println("A continuacion te muestro el menu");
        System.out.println("----------Menu----------");
        System.out.println("1-.Primer ejercicio");
        System.out.println("2-.Segundo ejercicio");
        System.out.println("3-.Tercer ejercicio");
        System.out.println("4-.Salr");
        System.out.println("------------------------");
        System.out.println("Tome en cuenta que un numero mayor a 4 tambien le saca del programa");
        //ascii
        /*int ascii=99;    
        char letra=(char)ascii;    
        System.out.println(""+letra);*/
                int ops= ninetales.nextInt();
        
        
        do{
            switch(ops){
                case 1:
                    
                    System.out.println("Ingrese el ejercicio al que quiere ir");
                    ops= ninetales.nextInt();
                    break;
                case 2:
                    piedraPapel();
                    
                    System.out.println("Ingrese el ejercicio al que quiere ir");
                    ops= ninetales.nextInt();
                    break;
                case 3:
                    System.out.println("Bienvenidx al primer ejercicio");
                    System.out.println("Ingrese cuantas columnas desea");
                    int columnas= ninetales.nextInt();
                    System.out.println("Ingrese la cantidad de filas");
                    int filas= ninetales.nextInt();
                    blink(columnas,filas);
                    
                    System.out.println("Ingrese el ejercicio al que quiere ir");
                    ops= ninetales.nextInt();
                    break;
                default:
                    ops=50;
            }
            
        }while(ops<4);
    }
    
    public static void piedraPapel(){
        Scanner nine = new Scanner(System.in);
        System.out.println("Bienvenidx");
        System.out.println("-----Reglas-----");
        System.out.println("0= Tijera");
        System.out.println("1= Papel");
        System.out.println("2= Piedra");
        System.out.println("3= Lizard");
        System.out.println("4= Spock");
        System.out.println("Suerte!!!");
        System.out.println("----------------");
        int uss= nine.nextInt();
        int max= 4;
        int min=0;
        int random=new Random().nextInt((max - min) + 1) + min;
        
        int [][] pokemona = new int [5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                if (i<j){
                    if(i==j){
                    pokemona[i][j]=0;
                    }
                    
                    if ((i<=3)&&(j>=1)){
                        pokemona[i][j]=3;
                    }
                    if (i+j%2!=0){
                        pokemona[i][j]=1;
                    }
                }
                if (i>j){
                    if(i+j%2!=0){
                        pokemona[i][j]=3;
                    }
                    if (i+j%2==0){
                        pokemona[i][j]=1;
                    }
                }
                pokemona[0][1]=1;
                pokemona[1][2]=1;
                pokemona[1][4]=1;
                pokemona[2][0]=1;
                pokemona[2][3]=1;
                pokemona[3][1]=1;
                pokemona[3][4]=1;
                pokemona[4][0]=1;
                pokemona[4][2]=1;
                
                System.out.print(pokemona[i][j]+"-");
            }
            System.out.println("");
        }
        
        
        if (pokemona[uss][random]==0){
            System.out.println("Nadie ha ganado");
        }else if(pokemona[uss][random]==1){
            System.out.println("Ganaste!!");
        }else{
            System.out.println("Gano la maquina");
        }
    }
    
    public static void blink(int columnas, int filas){
    int [][] filColumn = new int [filas][columnas];
    char [][]letritas = new char [filas][columnas];
    
    for (int i = 0; i < filColumn.length; i++) {
                        for (int j = 0; j < filColumn[i].length; j++) {
                            int maxi= 122;
                            int mini= 97;
                            int ran=new Random().nextInt((maxi - mini) + 1) + mini;
                            filColumn[i][j]=ran;
                            int ascii= filColumn[i][j];    
                            char letra=(char)ascii;  
                            letritas[i][j]=letra;
                            
                        }
                    }
    
    for (int i = 0; i < filColumn.length; i++) {
                        for (int j = 0; j < filColumn[i].length; j++) {
                            System.out.print(filColumn[i][j]+"-"); 
                        }
                        System.out.println(" ");
                    }
    
    for (int i = 0; i < filColumn.length; i++) {
                        for (int j = 0; j < filColumn[i].length; j++) {
                            System.out.print(letritas[i][j]+"-"); 
                        }
                        System.out.println(" ");
                    }
        
    
}
    //fin del metodo blink
    
}
