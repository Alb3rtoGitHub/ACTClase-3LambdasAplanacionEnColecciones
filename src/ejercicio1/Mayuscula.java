/*
Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
lista con los strings en mayúscula.
 */
package ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class Mayuscula {
    public static List<String> listaMayusculas (List<String> strings){
        return strings.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
    }
}
