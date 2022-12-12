/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_20_octubre_2022;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Clase_20_Octubre_2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        System.out.println("Ingrese");
        int cantidadNumero=entrada.nextInt();
        int cantidadNumerosEvaluados=0;
        int numeroMayor=0;
        while(cantidadNumerosEvaluados<cantidadNumero){
            System.out.println("Ingrese un numero a evaluar");
            int numero=entrada.nextInt();
            if(numero>=numeroMayor){
                numeroMayor=numero;//Acumuldor
            }else{
            numeroMayor=numeroMayor;
        }
            cantidadNumerosEvaluados++;//Contador
        }
        System.out.println("El numero mayor es: "+numeroMayor);
        */
        int opcionUsuario;
        
        do{
        System.out.println("----------Menu----------");
        System.out.println("1-. ejercicio if");
        System.out.println("2-. ............");
        System.out.println("3 Salir");
        System.out.println("Ingrese la opcion que desea: ");
        opcionUsuario=entrada.nextInt();
        
        if (opcionUsuario==1){
            //Ejercicio del if
            System.out.println("Ejercicio del if :D");
        }else if (opcionUsuario==2){
            //No se mana
            System.out.println("Ejercicio dos que ajaver que es :D");
        }else{
            //Fuimonos
            System.out.println("Bye");
        }
        
        }while(opcionUsuario==1||opcionUsuario==2);
        
    }
    
}
