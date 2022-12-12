/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_danielcarrasco;

import java.util.Random;
import java.util.Scanner;
public class Lab4P1_DanielCarrasco {


    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Bienvenidx, por favor ingrese a que programa quiere ingresar");
        //Mis 10 "-" a cada lado del menu
        System.out.println("----------Menu----------");
        System.out.println("1-.Fallout Words");
        System.out.println("2-.Rodatcripne");
        System.out.println("3-.Alpha");
        int opcion= ninetales.nextInt();
        System.out.println("------------------------");
        
        switch (opcion){
            case 1:
                metodoFallOut();
                    break;
            case 2:
                metodoRodatcripne();
                break;
            case 3:
                
                break;
            default:
                System.out.println("Ingresaste un numero incorrecto");
                break;
        }
    }
    public static void metodoFallOut(){
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Bienvenidx, por favor ingrese una palabra de la lista");
        System.out.println("1-. Comer");
        System.out.println("2-. Jugar");
        System.out.println("3-. Salta");
        System.out.println("4-. Llora");
        System.out.println("5-. Muere");
        System.out.println("6-. Unida");
        System.out.println("7-. Venti");
        System.out.println("8-. Llama");
        System.out.println("9-. Eevee");
        System.out.println("10-. Local");
        System.out.println("----------");
        String palabra= ninetales.nextLine();
        String palabraM= palabra.toLowerCase();
        int max= 10;
        int min=1;
        int conta=0;
        String palabraVemos= "";
        int random=new Random().nextInt((max - min) + 1) + min;
        
        do{
        switch (random){
            case 1:
                palabraVemos="comer";
                
                break;
            case 2:
                palabraVemos="jugar";
                
                break;
            case 3:
                palabraVemos="salta";
                
                break;
            case 4:
                palabraVemos="llora";
                
                break;
            case 5:
                palabraVemos="muere";
                
                break;
            case 6:
                palabraVemos="unida";
                
                break;
            case 7:
                palabraVemos="venti";
                
                break;
            case 8:
                palabraVemos="llama";
                
                break;
            case 9:
                palabraVemos="eevee";
                
                break;
            case 10:
                palabraVemos="local";
                
                break;
            default:
                
                break;
                
                
        }
        for (int b = 0; b < palabraVemos.length(); b++) {
            char letraR = palabraM.charAt(b);
            char letraH = palabraM.charAt(b);
            
            for (int h = 0; h < 10; h++) {
              if (letraR==letraH){
                conta++;
            }
              
            }
        }
            
            
        }while(conta<5);
        if(conta==5){
                  System.out.println("Es correcto"); 
              }else{
                  System.out.println("Es incorrecto");
              }

    }
    
    public static void metodoRodatcripne(){
    Scanner ninetales = new Scanner(System.in);
    System.out.println("Bienvenidx, ingrese su palabra");
    String contraseña= ninetales.nextLine();
    String contraseñaMin= contraseña.toLowerCase();
    //No sabía como ponerle
    String nada= "";
    String palabraFinal="";
    int max=9;
    int min=0;
    if (contraseña.equals(contraseñaMin)){
            for (int i = contraseñaMin.length()-1; i>=0; i--) {
                nada=nada+contraseñaMin.charAt(i);
            }
            
            for (int a = 0; a < nada.length(); a++) {
                char letra = nada.charAt(a);
            if (a%2!=0){
                palabraFinal+=new Random().nextInt((max - min) + 1) + min;
            }else{
                palabraFinal+=letra;
            }
        }
            System.out.println("Cambiado es: "+palabraFinal);
    }else{
        System.out.println("SOLO MINUSCULAS!!");
    }

}
    public static void metodoAlpha(){
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Ingresa tu palabra a evaluar: ");
        String palabraEv= ninetales.nextLine();
        String palabraEvNueva= palabraEv.toLowerCase();
        String palabraEvNN= palabraEvNueva.replace(" ", "");
    }
}
