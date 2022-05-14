package es.iespuertodelacruz.gppuerto.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorFichero {

    File fichero;
    
    public GestorFichero(String ruta) {
        fichero = new File(ruta);
    }

    /**
     * Metodo para leer el contenido de un fichero y devolverlo en un String.
     * @return String con el contenido del fichero
     */
    public String leerFichero() {
        String contenidoFich = "";
        String linea = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fichero));){
            while(linea != null) {
                linea = br.readLine();
                if(linea != null) {
                    contenidoFich += linea + "\n";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFich;
    }
    
    /**
     * Metodo para escribir contenido en un fichero.
     * @param contenido que se escribe en el fichero
     * @param ruta
     */
    public void escribirFichero(String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));){
            String[] lineas = contenido.split("\n");
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
