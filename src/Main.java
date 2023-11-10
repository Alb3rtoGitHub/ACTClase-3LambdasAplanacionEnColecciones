import ejercicio1.Mayuscula;
import ejercicio2.StringConcatenado;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
