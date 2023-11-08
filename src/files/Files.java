package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Files {
    public int contarLineas(String name) {
        File archivo; 
        FileReader reader; 
        BufferedReader bufer;
        int numLineas = 0;

        try{
            archivo = new File("D:\\archivos\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            while((bufer.readLine()) != null){
                numLineas ++;
            }
            reader.close();
        }
        catch (Exception e) {
            System.out.println("Error al abrir /leer archivo: " + e.toString());
        }
        return numLineas;
        
    }

    // Metodo que lee un archivo de texto plano
    // y almacena cada linea en un arreglo de Strings
    public String[] archivoAstrings(String name){
        File archivo; // Apuntar a un archivo fisico en el disco duro
        FileReader reader; // Para Abrir el archivo
        BufferedReader bufer; // Para leer la info del archivo
        String linea;
        String [] arreglo = null;
        int t; // Tamaño del acrhivo que sera el tamaño del arreglo
        int i = 0; // indice del arreglo
    
        try{
            // Saber cuantas lineas tiene el archivo
            t = contarLineas(name);
            // Construir el arreglo con el valor de t
            arreglo = new String[t];
            // Crear apuntador al archivo fisico
            archivo = new File("D:\\archivos\\" + name + ".txt");
            // Abrir el archivo para lectura
            reader = new FileReader(archivo);
            // Configurar buffer
            bufer = new BufferedReader(reader);
            // Lectura de la informacion del archivo
            while(( linea = bufer.readLine()) != null){
                arreglo[i] = linea;
                i++;
            }
            reader.close();
        }
        catch (Exception e) {
            System.out.println("Error al abrir /leer archivo: " + e.toString());
        }
        return arreglo;
    }

     // Metodo que lee un archivo de texto plano
    // y almacena cada linea en un arreglo de Int
    public int[] archivoAint(String name){
        File archivo; // Apuntar a un archivo fisico en el disco duro
        FileReader reader; // Para Abrir el archivo
        BufferedReader bufer; // Para leer la info del archivo
        String linea;
        int [] arreglo = null;
        int t; // Tamaño del acrhivo que sera el tamaño del arreglo
        int i = 0; // indice del arreglo
    
        try{
            // Saber cuantas lineas tiene el archivo
            t = contarLineas(name);
            // Construir el arreglo con el valor de t
            arreglo = new int [t];
            // Crear apuntador al archivo fisico
            archivo = new File("D:\\archivos\\" + name + ".txt");
            // Abrir el archivo para lectura
            reader = new FileReader(archivo);
            // Configurar buffer
            bufer = new BufferedReader(reader);
            // Lectura de la informacion del archivo
            while(( linea = bufer.readLine()) != null){
                arreglo[i] = Integer.parseInt(linea);
                i++;
            }
            reader.close();
        }
        catch (Exception e) {
            System.out.println("Error al abrir /leer archivo: " + e.toString());
        }
        return arreglo;
    }

    public void  escribirArchivo(String name){
        // Apuntar a la seccion del dd donde se crea
        FileWriter archivo;
        // Llave para aceeso en modo escritura
        PrintWriter writer;
        // Leer datos del teclado
        BufferedReader bufer = new BufferedReader( new InputStreamReader(System.in));
        String entrada;
        char respuesta;

        try{
            archivo = new FileWriter("D:\\archivos\\" + name + ".txt");
            writer = new PrintWriter(archivo);
            do{
                System.out.println("Escribe datos para el archivo: ");
                entrada = bufer.readLine();
                writer.println(entrada);
                System.out.println("Escribe X para parar: ");
                entrada = bufer.readLine();
                respuesta = entrada.charAt(0);
                
            }  while( respuesta != 'x');
            archivo.close();
        } catch ( Exception e){
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    } 



    public void arregloArchivo(String name, int[] array){
        FileWriter archivo;
        PrintWriter writer;

        try{
            archivo = new FileWriter("D:\\archivos\\" + name + ".txt");
            writer = new PrintWriter(archivo);
            for( int unDato : array) {
                writer.println(unDato);
            }
            archivo.close();
        } catch ( Exception e){
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    } 

public double[] archivoAdouble(String name){
    File archivo;
    FileReader reader;
    BufferedReader bufer;
    String linea;
    double [] arreglo = null;
    int t;
    int i = 0;

    try{
        t = contarLineas(name);
        arreglo = new double [t];
        archivo = new File("D:\\archivos\\" + name + ".txt");
        reader = new FileReader(archivo);
        bufer = new BufferedReader(reader);
        while(( linea = bufer.readLine()) != null){
            arreglo[i] = Double.parseDouble(linea);
            i++;
        }
        reader.close();
    }
    catch (Exception e) {
        System.out.println("Error al abrir /leer archivo: " + e.toString());
        }
    return arreglo;
    }


    public void arregloArchivo(String name, String[] array){
        FileWriter archivo;
        PrintWriter writer;
    
        try{
            archivo = new FileWriter("D:\\archivos\\" + name + ".txt");
            writer = new PrintWriter(archivo);
            for(String unDato : array) {
                writer.println(unDato);
            }
            archivo.close();
        } catch (Exception e){
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    }


    public void arregloArchivo(String name, double[] array){
        FileWriter archivo;
        PrintWriter writer;
    
        try{
            archivo = new FileWriter("D:\\archivos\\" + name + ".txt");
            writer = new PrintWriter(archivo);
            for(double unDato : array) {
                writer.println(unDato);
            }
            archivo.close();
        } catch (Exception e){
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    }
}