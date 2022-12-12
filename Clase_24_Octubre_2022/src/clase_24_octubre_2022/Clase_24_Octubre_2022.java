/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_24_octubre_2022;

import java.util.Scanner;
public class Clase_24_Octubre_2022 {


    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        char letra= 'b';
        
        switch(letra){
            //Aplicar el bug del break para que los ejecute todos de una
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("No es vocal");
                break;
        }

    }
    
}
