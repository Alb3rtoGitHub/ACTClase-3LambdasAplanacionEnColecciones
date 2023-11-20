import ejercicio1.Mayuscula;
import ejercicio2.StringConcatenado;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //como lo hizo Ivan revisado en clase con el grupo el 20/11/23:
        //puede ser también:
        //ArrayList<String> cadena = new ArrayList();
        //cadena.add("hola");
        //cadena.add("sebastian");
        //cadena.add("java es genial");
        //cadena.add("gracias por tu ayuda");
        /*
        package clase3ej1;

        import java.util.ArrayList;
        import java.util.stream.Collectors;

        public class Clase3ej1 {

            public static void main(String[] args) {
                ArrayList<String> cadena = new ArrayList();
        //        ArrayList<String> cadenaM = new ArrayList();

                cadena.add("hola");
                cadena.add("que");
                cadena.add("tal");
                cadena.add("estas");
                cadena.add("hoy");

                ArrayList<String> cadenaM = new ArrayList<> (cadena.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList()));
        //        cadena.forEach((str) -> cadenaM.add(str.toUpperCase()));
                System.out.println(cadenaM);
            }
        }
        */

        List<String> strings = Arrays.asList("hola", "sebastian", "java es genial", "gracias por tu ayuda");
        System.out.println(strings);

        //Ejercicio 1
        List<String> stringEnMayusculas = Mayuscula.listaMayusculas(strings);
        System.out.println(stringEnMayusculas);

        //Ejercicio 2
        String nuevoStringConcatenado = StringConcatenado.palabras(strings, 4);
        System.out.println(nuevoStringConcatenado);
    }
}
