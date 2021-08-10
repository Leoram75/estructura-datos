import java.io.*;
import java.util.*;


public class App {
    

    public static void main(String ars[]){
        try {
            String ruta = "filename.txt";
            Scanner sc = new Scanner(System.in);
            String contenido;
            
            System.out.print("Introduce la cadena de texto: ");
            contenido = sc.nextLine();
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Archivo creado: " );
            }
            else {
                System.out.println("El archivo ya existe.");
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            System.out.println("Ocurrio un ERROR.");
            e.printStackTrace();
        }
    }
}