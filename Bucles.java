// EJERCICIO BUCLES 1

import java.util.Scanner;

// Declaración variables de instancia
class entradas{
	float num;
}

public class Bucles {
	  public static void main(String args[]) {
			 entradas ent1 = new entradas(); // se crea la variable ent1 de clase entradas
			 Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
			 do {
				 System.out.println ("Itroduce número de 1 a 10: ");
				 ent1.num = sc.nextFloat();
			 } while (ent1.num < 1 || ent1.num > 10); // se pide introducir un número mientras dicho número sea menor que uno y mayor que 10
			 System.out.println ("Fin del programa.");
			 sc.close();
		}
}