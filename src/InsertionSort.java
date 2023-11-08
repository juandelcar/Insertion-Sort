/*
 * Copyright (c) [2023] [Juan Del Carmen Ramirez]
 * 
 * Permiso otorgado a cualquier persona que obtenga una copia de este software y 
 * archivos de documentación asociados (el "Software"), para tratar el Software 
 * sin restricción, incluidos, entre otros, los derechos de uso, copia, 
 * modificación, fusión, publicación, distribución, sublicencia y/o venta de 
 * copias del Software, y para permitir a las personas a las que se les proporcione 
 * el Software a hacerlo, con sujeción a las siguientes condiciones:
 * 
 * El anterior aviso de derechos de autor y este permiso serán incluidos en 
 * todos los avisos y/o copias sustanciales del Software.
 * 
 * EL SOFTWARE SE PROPORCIONA "TAL CUAL", SIN GARANTÍA DE NINGÚN TIPO, EXPRESA O 
 * IMPLÍCITA, INCLUYENDO, PERO NO LIMITADO A LAS GARANTÍAS DE COMERCIALIZACIÓN, 
 * IDONEIDAD PARA UN PROPÓSITO PARTICULAR Y NO INFRACCIÓN. EN NINGÚN CASO LOS 
 * AUTORES O TITULARES DE DERECHOS DE AUTOR SERÁN RESPONSABLES DE CUALQUIER 
 * RECLAMACIÓN, DAÑOS U OTRAS RESPONSABILIDADES, YA SEA EN UNA ACCIÓN DE CONTRATO, 
 * AGRAVIO O DE OTRA MANERA, DERIVADAS DE, FUERA DE O EN RELACIÓN CON EL SOFTWARE 
 * O EL USO U OTRAS NEGOCIACIONES EN EL SOFTWARE.
 */




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
