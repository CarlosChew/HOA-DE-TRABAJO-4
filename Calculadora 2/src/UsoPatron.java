//
// Programa uso del patron 
//     Factory Patron
//

import java.util.Scanner;

public class UsoPatron {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String cadena;
   
        System.out.print("Ingrese un vector: ");
        cadena = teclado.nextLine();
        System.out.println("leyo: "+cadena);

        // instanciar la Factory:
        Vfactory nfactory = new Vfactory(); 
        
        
    }
}