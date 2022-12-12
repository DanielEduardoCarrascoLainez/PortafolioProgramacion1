/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_danielcarrasco;

import java.util.Scanner;
public class Lab3P1_DanielCarrasco {

    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Bienvenidx al programa, ingresa la opcón que deseas ejecutar");
        System.out.println("----------Menu----------");
        System.out.println("1-.Cadena Repetida");
        System.out.println("2-.Sumatoria");
        System.out.println("3-.Reloj");
        System.out.println("4-.Salir");
        System.out.println("------------------------");
        int op=ninetales.nextInt();
        do{
        switch(op){
            //Aplicar el bug del break para que los ejecute todos de una
            case 1:
                Scanner nine = new Scanner(System.in);
                System.out.println("Bienvenidx al primer ejercicio");
                System.out.println("Ingrese la oracion: ");
                String oracion=nine.nextLine();
                char nuevaoracion=oracion.charAt(1);
                
                for(int contador=0;nuevaoracion>contador; contador++){
                   nuevaoracion=oracion.charAt('.');
                   //Nofunciona :(
                }
                break;
            case 2:
                System.out.println("Bienvenidx al segundo ejercicio");
                System.out.println("Ingrese su ecuación: ");
                double ecuacion=ninetales.nextDouble();
                

                break;
            case 3:
                System.out.println("Bienvenidx al tercer ejercicio");
                System.out.println("Ingrese un numero impar, por ejemplo 3, 5 o 7");
                int altura=ninetales.nextInt();
                if (altura<=3){
                for(int a=0; a<altura*2-1; a++){
                    for(int b=0; b<altura*2-1; b++){
                        if ((b%2==0 && a==0)||(a==b)||(a+b==altura*2-2)){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println("");
                }
                        
                }else{
                    //Vemos
                    for(int a=0; a<altura*2-1; a++){
                    for(int b=0; b<altura*2-1; b++){
                        if ((b%2==0 && a==0)||(a==b)||(a+b==altura*2-2)){
                            System.out.print("*");
                        //Lo de abajo en comentarios es mi intento de hacer el brillo    
                        /*}if((b+a==altura*2-3)||(b==0 && a==0)||(b+a<altura*2-2&&b+a>altura)){
                            System.out.print("+");*/
                        }else{
                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println("");
                }
                }

                break;
            default:
                System.out.println("Nos vemos a la otra");

                break;
        }
            System.out.println("Segurx? ingrese 4 para salir, 1, 2 o 3 para seguir");
            op=ninetales.nextInt();
        }while(op<4);
        System.out.println("Bye!!");
    }
    
}
