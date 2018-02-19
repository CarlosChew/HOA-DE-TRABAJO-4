/* CALCULATOR POSTFIX
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * CARLOS CHEW - 17507
 * OTTO TRUJILLO - 17189
*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Main {


	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		CalculatorStack calc = new CalculatorStack();

		System.out.println("---CALCULADORA POSTFIX---");
		System.out.println("Insert name file (EXAMPLE 'datos.txt'): ");
		String nombre = sc.nextLine(); 
		File datos = new File(nombre);  
		try 
		{
			String line;
			BufferedReader  reader = new BufferedReader(new FileReader(datos));
			 while((line = reader.readLine()) != null) {
			System.out.println(line + " =" + calc.calculate(line));
			 }
			 reader.close();
		}
		
		catch(IOException e) {
			System.out.println("MESSAGE: " + e.getMessage()); 
		}

	}

}