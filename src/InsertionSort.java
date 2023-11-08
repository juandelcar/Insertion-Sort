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

        Object arreglo = null;

        if (tipoArreglo.equals("int")) {
            arreglo = arch.archivoAint(filename);
            insertionSort((int[]) arreglo);
        } else if (tipoArreglo.equals("string")) {
            arreglo = arch.archivoAstrings(filename);
            insertionSort((String[]) arreglo);
        } else if (tipoArreglo.equals("double")) {
            arreglo = arch.archivoAdouble(filename);
            insertionSort((double[]) arreglo);
        } else {
            System.out.println("Tipo de arreglo no reconocido. ");
        }

        System.out.println("¿Deseas Guardar el arreglo en un archivo o mostrarlo en pantalla? : (archivo/pantalla) ");
        String opcion  = bufer.readLine();

        if (opcion.equals("archivo")) {
            System.out.println("Ingresa el nombre del archivo donde se guardará el arreglo ordenado: ");
            String nombreArchivo = bufer.readLine();
            if (arreglo instanceof int[]) {
                arch.arregloArchivo(nombreArchivo, (int[]) arreglo);
            } else if (arreglo instanceof String[]) {
                arch.arregloArchivo(nombreArchivo, (String[]) arreglo);
            } else if (arreglo instanceof double[]) {
                arch.arregloArchivo(nombreArchivo, (double[]) arreglo);
            }
        } else if (opcion.equals("pantalla")) {
            if (arreglo instanceof int[]) {
                for (int i : (int[]) arreglo) {
                    System.out.println(i);
                }
            } else if (arreglo instanceof String[]) {
                for (String s : (String[]) arreglo) {
                    System.out.println(s);
                }
            } else if (arreglo instanceof double[]) {
                for (double d : (double[]) arreglo) {
                    System.out.println(d);
                }
            }
        } else {
            System.out.println("Opción no reconocida. ");
        }
    }   

    public static int[] insertionSort(int[] arreglo) {
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
        return arreglo;
    }

    public static double[] insertionSort(double[] arreglo){
        for (int i = 1; i < arreglo.length; i++){
            double key = arreglo[i];
            int j = i-1;

            // Mover los arreglos a una posición adelante
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = key;
        }
        return arreglo;
    }

    public static String[] insertionSort(String[] arreglo) {
        for (int i = 1; i < arreglo.length; i++){
            String key = arreglo[i];
            int j = i - 1;

            // Mover los arreglos a una posición adelante
            while (j >= 0 && arreglo[j].compareTo(key) > 0) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = key;
        }
        return arreglo;
    }
}
