package numero;

import java.util.Scanner;

public class numero {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dato = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int numero = dato.nextInt();
		
		System.out.println("El doble del numero que ingresaste es " + numero*2);
		
		dato.close();;
		
		
		

	}

}
