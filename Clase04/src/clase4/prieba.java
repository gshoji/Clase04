package clase4;

public class prieba {
	
	String letraPalabra;
	
	//public  prieba(String )
	
	
	public static int contarLetra(String unaPalabra, char letra){

		this.letraPalabra=unaPalabra;
		int cuenta = 0;

		for (int i = 0; i<letraPalabra.length; i++){

		if( letraPalabra.charAt(i)  == letra){

		cuenta = cuenta + 1;

		}

		}

		return cuenta;

		}

}
