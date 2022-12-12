/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_explicación_26_noviembre;

import java.util.Scanner;

public class Ejercicio_Explicación_26_Noviembre {

    public static void main(String[] args) {
        // Daniel Carrasco, Catalina Yushan, Luis Mendoza, Byron Lemuz y Salvador Macias
        //Gran nombre de scanner obvi
        Scanner ninetales = new Scanner(System.in);
        System.out.println("Buenas");
        System.out.println("Ingrese el ejercicio al que quiere ir");
        //Siempre los 10 "-" a cda lado para ser aesthetic
        System.out.println("----------Menu----------");
        System.out.println("1-.Pastel de Fresa");
        System.out.println("2-.Pastel de Vainilla");
        System.out.println("3-.Pastel de Chocolate");
        System.out.println("4-.Pastel de Red Velvet");
        System.out.println("5-.Pastel de Zanahoria");
        System.out.println("6-.Pastel de Molten");
        System.out.println("7-.Salir");
        System.out.println("------------------------");
        int ejercicio = ninetales.nextInt();
        
        do{
            
            switch (ejercicio){
                case 1:
                    System.out.println("Bienvenidx a la receta del pastel de fresa");
                    System.out.println("A continuacion te mostramos la receta :D");
                    Pasteles Fresa = new Pasteles (400,433,3,3,"fresa",345,2,10,360);
                    System.out.println("Lo necesario para esta receta es:");
                    System.out.println("---------------------------------");
                    System.out.println("Azucar "+Fresa.getAzucar()+" gramos");
                    System.out.println("Harina "+Fresa.getHarina()+" gramos");
                    System.out.println("Bicarbonato "+Fresa.getBicarbonato()+" cuartos de una cucharadita");
                    System.out.println("Huevos "+Fresa.getHuevos());
                    System.out.println("Diez unidades de "+Fresa.getUnico());
                    System.out.println("Mantequilla "+Fresa.getMantequilla()+" gramos");
                    System.out.println("Sal "+Fresa.getSal()+" cucharaditas");
                    System.out.println("Gotas de vainilla "+Fresa.getGotVainilla());
                    System.out.println(+Fresa.getLitLeche()+" mililitros de leche");
                    System.out.println("---------------------------------");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese a que receta a la que quiere ir o 7 para salir");
                    ejercicio = ninetales.nextInt();
                    break;
                case 2:
                    System.out.println("Bienvenidx a la receta del pastel de vainilla");
                    System.out.println("A continuacion te mostramos la receta :D");
                    Pasteles Vainilla = new Pasteles (410,433,3,3,"Leche Condensada",345,2,20,360);
                    System.out.println("Lo necesario para esta receta es:");
                    System.out.println("---------------------------------");
                    System.out.println("Azucar "+Vainilla.getAzucar()+" gramos");
                    System.out.println("Harina "+Vainilla.getHarina()+" gramos");
                    System.out.println("Bicarbonato "+Vainilla.getBicarbonato()+" cuartos de una cucharadita");
                    System.out.println("Huevos "+Vainilla.getHuevos());
                    System.out.println("Un toque de "+Vainilla.getUnico());
                    System.out.println("Mantequilla "+Vainilla.getMantequilla()+" gramos");
                    System.out.println("Sal "+Vainilla.getSal()+" cucharaditas");
                    System.out.println("Gotas de vainilla "+Vainilla.getGotVainilla());
                    System.out.println(+Vainilla.getLitLeche()+" mililitros de leche");
                    System.out.println("---------------------------------");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese a que receta a la que quiere ir o 7 para salir");
                    ejercicio = ninetales.nextInt();
                    break;
                case 3:
                    System.out.println("Bienvenidx a la receta del pastel de chocolate");
                    System.out.println("A continuacion te mostramos la receta :D");
                    Pasteles Chocolate = new Pasteles (390,433,3,4,"Cocoa",350,2,5,360);
                    System.out.println("Lo necesario para esta receta es:");
                    System.out.println("---------------------------------");
                    System.out.println("Azucar "+Chocolate.getAzucar()+" gramos");
                    System.out.println("Harina "+Chocolate.getHarina()+" gramos");
                    System.out.println("Bicarbonato "+Chocolate.getBicarbonato()+" cuartos de una cucharadita");
                    System.out.println("Huevos "+Chocolate.getHuevos());
                    System.out.println("440 gramos de "+Chocolate.getUnico());
                    System.out.println("Mantequilla "+Chocolate.getMantequilla()+" gramos");
                    System.out.println("Sal "+Chocolate.getSal()+" cucharaditas");
                    System.out.println("Gotas de vainilla "+Chocolate.getGotVainilla());
                    System.out.println(+Chocolate.getLitLeche()+" mililitros de leche");
                    System.out.println("---------------------------------");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese a que receta a la que quiere ir o 7 para salir");
                    ejercicio = ninetales.nextInt();
                    break;
                case 4:
                    System.out.println("Bienvenidx a la receta del pastel de red velvet");
                    System.out.println("A continuacion te mostramos la receta :D");
                    Pasteles Red = new Pasteles (400,433,3,4,"Cocoa",350,2,10,390);
                    System.out.println("Lo necesario para esta receta es:");
                    System.out.println("---------------------------------");
                    System.out.println("Azucar "+Red.getAzucar()+" gramos");
                    System.out.println("Harina "+Red.getHarina()+" gramos");
                    System.out.println("Bicarbonato "+Red.getBicarbonato()+" cuartos de una cucharadita");
                    System.out.println("Huevos "+Red.getHuevos());
                    System.out.println("260 gramos de "+Red.getUnico());
                    System.out.println("Mantequilla "+Red.getMantequilla()+" gramos");
                    System.out.println("Sal "+Red.getSal()+" cucharaditas");
                    System.out.println("Gotas de vainilla "+Red.getGotVainilla());
                    System.out.println(+Red.getLitLeche()+" mililitros de leche");
                    System.out.println("---------------------------------");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese a que receta a la que quiere ir o 7 para salir");
                    ejercicio = ninetales.nextInt();
                    break;
                case 5:
                    System.out.println("Bienvenidx a la receta del pastel de zanahoria");
                    System.out.println("A continuacion te mostramos la receta :D");
                    Pasteles Z = new Pasteles (220,433,3,4,"Zanahoria rayada",300,2,5,390);
                    System.out.println("Lo necesario para esta receta es:");
                    System.out.println("---------------------------------");
                    System.out.println("Azucar "+Z.getAzucar()+" gramos");
                    System.out.println("Harina "+Z.getHarina()+" gramos");
                    System.out.println("Bicarbonato "+Z.getBicarbonato()+" cuartos de una cucharadita");
                    System.out.println("Huevos "+Z.getHuevos());
                    System.out.println("2 tazas de "+Z.getUnico());
                    System.out.println("Mantequilla "+Z.getMantequilla()+" gramos");
                    System.out.println("Sal "+Z.getSal()+" cucharaditas");
                    System.out.println("Gotas de vainilla "+Z.getGotVainilla());
                    System.out.println(+Z.getLitLeche()+" mililitros de leche");
                    System.out.println("---------------------------------");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese a que receta a la que quiere ir o 7 para salir");
                    ejercicio = ninetales.nextInt();
                    break;
                case 6:
                    System.out.println("Bienvenidx a la receta del pastel de molten");
                    System.out.println("A continuacion te mostramos la receta :D");
                    Pasteles Molten = new Pasteles (380,350,4,2,"Helado",250,2,15,345);
                    System.out.println("Lo necesario para esta receta es:");
                    System.out.println("---------------------------------");
                    System.out.println("Azucar "+Molten.getAzucar()+" gramos");
                    System.out.println("Harina "+Molten.getHarina()+" gramos");
                    System.out.println("Bicarbonato "+Molten.getBicarbonato()+" cuartos de una cucharadita");
                    System.out.println("Huevos "+Molten.getHuevos());
                    System.out.println("2 tazas de "+Molten.getUnico());
                    System.out.println("Mantequilla "+Molten.getMantequilla()+" gramos");
                    System.out.println("Sal "+Molten.getSal()+" cucharaditas");
                    System.out.println("Gotas de vainilla "+Molten.getGotVainilla());
                    System.out.println(+Molten.getLitLeche()+" mililitros de leche");
                    System.out.println("---------------------------------");
                    System.out.println(" ");
                    
                    System.out.println("Ingrese a que receta a la que quiere ir o 7 para salir");
                    ejercicio = ninetales.nextInt();
                    break;
                default:
                    ejercicio=20;
                    
            }
            
        }while (ejercicio<7);
        System.out.println("Vuelva pronto");
        
    }
    
}
