/*
Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
método debe devolver un String que concatene separando por coma y espacio todas las
palabras, en la lista, que tengan más de "n" caracteres.
 */
package ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenado {
    public static String palabras (List<String> strings, int n){
        //return strings.stream().filter(string -> string.length() > n).map(string -> string + ", ").collect(Collectors.joining());
        //return strings.stream().filter(string -> string.length() > n).collect(Collectors.joining(", "));

        //la mejor salida es esta, con flatMap separo por palabras, luego filtro por mayor a n caracteres y luego el joining
        return strings.stream().flatMap(s -> Arrays.stream(s.split(" "))).filter(s->s.length()>n).collect(Collectors.joining(", "));
    }
}
