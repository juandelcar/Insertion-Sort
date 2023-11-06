import files.Files;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InsertionSort {
    public static void main(String[] args) throws IOException {
        Files arch = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String filename;

        System.out.println("¿Que tipo de arreglo deseas ordenar? (int,string o double)");
        String tipoArreglo = bufer.readLine();

        System.out.println("Ingresa el nombre del archivo");
        filename = bufer.readLine();        

        if (tipoArreglo.equals("int")) {
            int[] arreglo = arch.archivoAint(filename);
        } else if (tipoArreglo.equals("string")) {
            String[] arreglo = arch.archivoAstrings(filename);
        } else if (tipoArreglo.equals("double")) {
            double[] arreglo = arch.archivoAdouble(filename);
        } else {
            System.out.println("Tipo de arreglo no reconocido ");
        }
    }
}
