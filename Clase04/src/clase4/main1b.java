package clase4;

import java.util.Scanner;

public class main1b {

	
	//Ejer 1b
	public static void main(String[] args)
	{
		int num[]=new int[3];
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		int nu1=leer.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int nu2=leer.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		int nu3=leer.nextInt();
		System.out.println("Ingrese inicial para el orden: ");
		char let=leer.next().charAt(0);
		
		Ejer01 ejer1 =new Ejer01(nu1,nu2,nu3,let);
		num=ejer1.mostrar();
		for (int i=0;i<num.length;i++) 
		{
			System.out.println(num[i]);
		}

	}

}
