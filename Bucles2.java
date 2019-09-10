// EJERCICIO BUCLES 2

import java.util.Scanner;

// Declaración variables de instancia
class entradas{
	String s1;
}

class auxiliar{
	int i;
	int j;
	int longitud;
	int num;
	int num_aux;
	boolean aux;
}

public class Bucles2 {
	public static void main(String args[]) {
		 entradas ent1 = new entradas(); // se crea la variable ent1 de clase entradas
		 auxiliar aux1 = new auxiliar(); // se crea la variable aux1 de clase auxiliar
		 	aux1.i = 0;
		 	aux1.j = 0;
		 	aux1.num_aux = 0;
		 	aux1.aux = false;
		 Scanner sc = new Scanner(System.in); // se crea la variable sc que permite introducir datos por teclado
		 System.out.println ("Itroduce texto: ");
		 ent1.s1 = sc.nextLine(); // se introduce la cadena de texto
		 sc.close();
		 aux1.longitud = ent1.s1.length(); // se extrae la longitud de la cadena de texto y se almacena.
		 while (aux1.i < aux1.longitud) { 
			 aux1.num = ent1.s1.indexOf('a',aux1.i);
			 
			 if (aux1.num > aux1.i) {
				 aux1.num_aux = aux1.num;
				 aux1.aux = true; 
			 } else {aux1.aux = false;}
			 
			 if (aux1.aux != true ) 
				 aux1.j++;
			 
			 if (aux1.num == -1)
				 aux1.j--;
			 aux1.i++;
		 }
		 if (aux1.j == 1)
			 System.out.println ("La letra a se repite " + aux1.j + " vez."); 
		 else
			 System.out.println ("La letra a se repite " + aux1.j + " veces."); 
	}
}
