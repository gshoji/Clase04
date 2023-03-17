package clase4;


//Main Ejer01A
public class Main {

	public static void main(String[] args) {
		int num[]=new int[3];
		Ejer01 ejer1=new Ejer01(1,2,3,'d');
		num=ejer1.mostrar();
		for (int i=0;i<num.length;i++) 
		{
			System.out.println(num[i]);
		}
	

	}

}
