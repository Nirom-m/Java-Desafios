import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    static String toCamelCase(String s) {

        /*
         * Generamos una variable para dividir el string a partir del caracter "-" o "_",
         * esto con el objetivo de poder acceder a la primer palabra posteriormente
         */
        String[] words = s.split("[_-]");

        /*
         * Transformación a Camel Case:
         * Verificamos si es la primer palabra y la dejamos intacta.
         * Si no, hacemos mayúscula la primer letra y la concatenamos con el resto de la
         * palabra.
         * Unimos todas las palabras.
         */
        String camelCase = Arrays.stream(words)
                .map(
                        // Verificamos si es la primer palabra y la dejamos intacta
                        word -> word == words[0] ? word :
                        // Si no, hacemos mayúscula la primer letra y la concatenamos con el resto de la
                        // palabra
                                Character.toUpperCase(word.charAt(0)) + word.substring(1))
                // Unimos todas las palabras
                .collect(Collectors.joining());
                
        return camelCase;
    }

    public static void main(String[] args) {
        String palabra = "the-stealth_warrior";
        System.out.println(toCamelCase(palabra));
    }
}
