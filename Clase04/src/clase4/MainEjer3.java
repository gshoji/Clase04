package clase4;

public class MainEjer3 {

	public static void main(String[] args) {
		
		String rutaArchivo="C:\\Users\\gasto\\OneDrive\\Escritorio\\ArchivosJava\\Archivo01.txt";
		String rutaSalida="C:\\Users\\gasto\\OneDrive\\Escritorio\\ArchivosJava\\ArchivoSalida.txt";
		Ejer03 ejer3 =new Ejer03("Codificacion",1,rutaArchivo,rutaSalida);
		ejer3.LeerArchivos();
		

	}

}
