package clase4;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;



public class Ejer03
{
	String Path;
	String tip;
	int desp;
	String rutaent;
	String rutasali;
	int n1,n2,n3;
	String palabra;
	char codi[]=new char[100];
	char deco[]=new char[100];
	
	public Ejer03 (String tipo,int desplazo,String rutaentrada,String rutasalida)
	{
		this.tip=tipo;
		this.desp=desplazo;
		this.rutaent=rutaentrada;
		this.rutasali=rutasalida;
	}
	

	public void LeerArchivos() 
	{
		try {
			for (String linea : Files.readAllLines(Paths.get(rutaent)))
			{
				palabra=linea;

			}
	
				for(int i=0;i<palabra.length();i++)
				{
					if((palabra.charAt(i))=='z')
					{
						codi[i]='a';
					}
					else
					{
						codi[i]=(char) ((palabra.charAt(i))+desp);
					}
				}
				for(int i=0;i<palabra.length();i++)
				{
					if((palabra.charAt(i))=='a')
					{
						deco[i]='z';
					}
					else
					{
						deco[i]=(char) ((palabra.charAt(i))-desp);
					}

				}
				
				if(tip=="Codificacion")
				{
					
					System.out.println(" Finalizo la Codificacion: ");
					String temp=String.valueOf(codi);
				
					Files.writeString(Paths.get(rutasali), temp);
				}
				else 
				{
					String temp=String.valueOf(deco);
					System.out.println(" Finalizo la Decodificacion: ");
				
					Files.writeString(Paths.get(rutasali), temp);

				}


			
			
			
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
