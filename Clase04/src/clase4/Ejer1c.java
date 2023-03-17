package clase4;

import java.util.Scanner;


//Ejer1c
public class Ejer1c {

	public static void main(String[] args) {
		
		int n1=1;
		int n2=3;
		int n3=2;
		char orden='a';
		int num[]=new int[3];

		
		if((n1==0)&&(n2==0)&&(n3==0))
		{
			
			Scanner leer=new Scanner(System.in);
			System.out.println("Ingrese el primer numero: ");
			int nu1=leer.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			int nu2=leer.nextInt();
			System.out.println("Ingrese el tercer numero: ");
			int nu3=leer.nextInt();
			System.out.println("Ingrese inicial para el orden: a- Ascendente o d- Descendente ");
			char let=leer.next().charAt(0);
			
			Ejer01 ejer1 =new Ejer01(nu1,nu2,nu3,let);
			num=ejer1.mostrar();
			for (int i=0;i<num.length;i++) 
			{
				System.out.println(num[i]);
			}
		}
		else
		{
			Ejer01 ejer1 =new Ejer01(n1,n2,n3,orden);
			num=ejer1.mostrar();
			for (int i=0;i<num.length;i++) 
			{
				System.out.println(num[i]);
			}
		}
		


	}

}
