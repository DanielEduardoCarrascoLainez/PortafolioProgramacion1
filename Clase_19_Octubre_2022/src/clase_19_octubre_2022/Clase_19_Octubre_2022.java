/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_19_octubre_2022;

import java.util.Scanner;
public class Clase_19_Octubre_2022 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
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
    }
    
}
