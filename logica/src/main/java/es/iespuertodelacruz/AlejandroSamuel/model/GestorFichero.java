package es.iespuertodelacruz.AlejandroSamuel.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestorFichero {
    
    public void leerFichero(){
        File f = new File("/tmp/entrada.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while (linea != null) {
                linea = br.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fr != null)
try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void escribirFichero(){

        File f = new File("salida.txt");
        try { 
            FileWriter fw = new FileWriter(f,true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            String texto = " ";
            while (texto.length() > 0) { 
                texto = br.readLine(); 
                fw.write(texto + "\r\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
