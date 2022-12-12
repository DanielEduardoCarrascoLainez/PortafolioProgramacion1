/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_18_octubre_2022;

import java.util.Scanner;
public class Clase_18_Octubre_2022 {

    public static void main(String[] args) {
    //Primer programa
    Scanner entrada = new Scanner(System.in);
    //System.out.println("Ingrese u edad");
    //int edad= entrada.nextInt();
    
    //if(edad>=18){
      //  System.out.println("Usted es mayor de edad");
    //}
    
    //Segundo programa
    //System.out.println("Ingrese el imc: ");
    //double imc=entrada.nextDouble();
    //if(imc<25.00){
      //  System.out.println("Dentro del promedio");
    //}else{
        //System.out.println("Tiene sobrepeso");
    //}
    
    System.out.println("Ingrese su nota");
    int nota=entrada.nextInt();
    if((nota>=0)&&(nota<=69)){
        System.out.println("Reprobado >:o");
    }else{
       if((nota>=70)&&(nota<=80)){
           System.out.println("Aprobado >:D");
       }else{
        if((nota>=81)&&(nota<=90)){
           System.out.println("Sobresaliente >:D");
        }else{
            System.out.println("Amazing");
        }
       }
    }
    }
    
}
