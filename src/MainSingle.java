/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author ottoalexander
 */
public class MainSingle {
    private static Scanner sc;

	public static void main(String[] args) {
            sc = new Scanner(System.in);
		CalculatorSingle single = new CalculatorSingle();
                
                System.out.println("---CALCULADORA Singleton---");
		System.out.println("Insert name file (EXAMPLE 'datos.txt'): ");
		String nombre = sc.nextLine(); 
                File datos = new File(nombre);
                try 
		{
			String line;
			BufferedReader  reader = new BufferedReader(new FileReader(datos));
			 while((line = reader.readLine()) != null) {
			System.out.println(line + " =" + single.contains(line));
			 }
			 reader.close();
		}
		
		catch(IOException e) {
			System.out.println("MESSAGE: " + e.getMessage()); 
		}
                
        }
}
