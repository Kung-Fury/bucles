// EJERCICIO BUCLES 3

import java.util.Scanner;

// Declaración variables de instancia
class entradas{
	int num;
}

class auxiliar{
	int i;
	int j;
	int suma;
}
public class bucles3 {
	public static void main(String args[]) {
		 entradas ent1 = new entradas(); // se crea la variable ent1 de clase entradas
		 auxiliar aux1 = new auxiliar(); // se crea la variable aux1 de clase auxiliar
		 	aux1.j = 0;
		 	aux1.suma = 0;
		 Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
		 System.out.println ("Itroduce número entero mayor que 1: ");
		 ent1.num = sc.nextInt(); // se introduce la cadena de texto
		 sc.close();
		 
		 if (ent1.num > 1) {
			 for (aux1.i = 0; aux1.i <= ent1.num; aux1.i++ ) {
				 aux1.suma = aux1.suma + aux1.i;
			 }
			 System.out.println ("La suma es todos los números enteros hasta  " + ent1.num + " es " + aux1.suma + ".");
		 } else 
			 System.out.println ("El número introducido no es válido.");
	}
}
