/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5p1_danielcarrasco;

import java.util.Scanner;
public class Lab5P1_DanielCarrasco {


    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        //Siempre mi scanner es ninetales o variantes como nine, tales y otros, si se lo ven a alguien más posiblemente me copiaron
        //Igual mi menú siempre trae 10 "-" de cada laso de la palabra
        System.out.println("Bienvenidx!");
        System.out.println("Este es mi examen de semana 5");
        System.out.println("A continuacion te muestro el menu");
        System.out.println("----------Menu----------");
        System.out.println("1-. ");
        System.out.println("2-. ");
        System.out.println("3-. ");
        System.out.println("4-. Salir");
        System.out.println("------------------------");
        System.out.println("Tome en cuenta que un numero mayor a 4 le saca del programa");
        int ejercicio= ninetales.nextInt();
        
        //DO para enu
        do{
            
            switch (ejercicio){
                
                case 1:
                    
                    System.out.println("Ingrese al ejercicio que quiere ir o 4 para salir: ");
                    ejercicio= ninetales.nextInt();
                    break;
                case 2:
                    
                    System.out.println("Ingrese al ejercicio que quiere ir o 4 para salir: ");
                    ejercicio= ninetales.nextInt();
                    break;
                case 3:
                    
                    System.out.println("Ingrese al ejercicio que quiere ir o 4 para salir: ");
                    ejercicio= ninetales.nextInt();
                    break;
                default:
                    ejercicio=10;
                    
                    break;
            }
            
        }while (ejercicio<4);
        //condicion
        
    }
    //METODOS
    
}
