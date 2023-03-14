package clase4;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class Ejer02 {

			String Path;
			String operacion;
			String vec[]=new String[100];
			int sum=0;
			int multi=1;
	
		public  Ejer02(String Ruta,String tipo)
		{
			this.Path=Ruta;
			this.operacion=tipo;
		}	
			

		public void LeerArchivos() 
		{
			try {
				for (String linea : Files.readAllLines(Paths.get(Path)))
				{
				   //System.out.println(linea);
					vec=linea.split(",");
				}
				for(int i=0;i<vec.length;i++)
				{
					if(operacion=="suma")
					{
						sum+=Integer.parseInt(vec[i]);
					}
					else
					{
						sum*=Integer.parseInt(vec[i]);
					}
				}
				System.out.println(sum);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
