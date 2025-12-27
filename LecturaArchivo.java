package accesodatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LecturaArchivo {

	public static void leerfichero(String ruta) throws FileNotFoundException, IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
    	  	String linea;
    		int contadorLineas = 0;
        while((linea = br.readLine())!= null) {
    	
                contadorLineas++;
                // Mostramos la línea y el número de caracteres que contiene
                int numCaracteres = linea.length();
                System.out.println("Linea" + contadorLineas + ":");
                System.out.println("Número de caracteres: " + numCaracteres);
                System.out.println("-------------------------");
        }
        
        br.close();
        System.out.println("Total de líneas leídas: " + contadorLineas);

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encuentra: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }


public static void main(String[] args) throws IOException {
	
	leerfichero("D:\\CESUR DAM\\Segundo\\Acceso a datos\\Cuento.txt");
}
}