import files.Files;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InsertionSort {
    public static void main(String[] args) throws IOException {
        Files arch = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String filename;

        System.out.println("¿Que tipo de arreglo deseas ordenar? (int,string o double): ");
        String tipoArreglo = bufer.readLine();

        System.out.println("Ingresa el nombre del archivo: ");
        filename = bufer.readLine();        

        System.out.println("¿En que orden quieres ordenar los elemtos? (Ascendente, Descendente)");
        String orden = bufer.readLine();

        if (tipoArreglo.equals("int")) {
            int[] arreglo = arch.archivoAint(filename);
            insertionSort(arreglo);
        } else if (tipoArreglo.equals("string")) {
            String[] arreglo = arch.archivoAstrings(filename);
        } else if (tipoArreglo.equals("double")) {
            double[] arreglo = arch.archivoAdouble(filename);
        } else {
            System.out.println("Tipo de arreglo no reconocido. ");
        }

    }

    public static void insertionSort(int[] arreglo) {
        for (int i= 1 ; i < arreglo.length; i++) {
            int key = arreglo[i];
            int j = i -1;

            // Mover los arreglos a una posición adelante
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j +1] = arreglo[j];
                j = j-1;
            }
            arreglo[j +1] = key;
        }
    }
}
