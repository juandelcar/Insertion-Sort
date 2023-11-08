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



Insertion Sort
Este es un programa en Java que implementa el algoritmo de ordenamiento por inserción para ordenar arreglos de elementos de tipo entero (int), de tipo cadena (String) y de tipo punto flotante (double). El programa te permite ingresar un arreglo desde un archivo, ordenarlo y luego elegir si deseas guardar el arreglo ordenado en un archivo o mostrarlo en pantalla.

Uso
Ejecuta el programa InsertionSort.java desde tu entorno de desarrollo Java o utilizando la línea de comandos.

El programa te pedirá que ingreses el tipo de arreglo que deseas ordenar (int, string o double).

A continuación, ingresa el nombre del archivo que contiene el arreglo que deseas ordenar. Asegúrate de que el archivo esté en el mismo directorio que el programa o proporciona la ruta completa al archivo.

El programa leerá el archivo y realizará el ordenamiento por inserción en el arreglo.

Después de ordenar el arreglo, tendrás la opción de guardar el arreglo ordenado en un archivo o mostrarlo en pantalla.

Si eliges "archivo", el programa te pedirá que ingreses un nombre para el archivo donde se guardará el arreglo ordenado.

Si eliges "pantalla", el arreglo ordenado se mostrará en la consola.

El programa identificará automáticamente el tipo de datos del arreglo (int, string o double) y realizará el proceso correspondiente.

Funciones
insertionSort(int[] arreglo): Implementa el algoritmo de ordenamiento por inserción para arreglos de enteros.
insertionSort(double[] arreglo): Implementa el algoritmo de ordenamiento por inserción para arreglos de punto flotante.
insertionSort(String[] arreglo): Implementa el algoritmo de ordenamiento por inserción para arreglos de cadenas

Requisitos
Debes tener Java instalado en tu sistema.
Los archivos de entrada deben estar en el mismo directorio que el programa o proporcionar la ruta completa al archivo.
Debes tener la libreria Files con todos los metodos necesarios para su ejecución.

Notas
Si el tipo de arreglo ingresado no es reconocido (no es int, string o double), el programa mostrará un mensaje de error.
Si la opción ingresada para guardar o mostrar el arreglo no es reconocida (ni "archivo" ni "pantalla"), el programa mostrará un mensaje de error.

Autor
Este programa fue desarrollado por Juan Del Carmen Ramirez.