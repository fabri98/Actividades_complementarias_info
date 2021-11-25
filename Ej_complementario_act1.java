import java.util.*;
public class Ej_complementario_act1 {
    
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("rrope");
        palabras.add(null);
        palabras.add("asd");

    
        System.out.println(palabras);
        palabras.removeAll(Arrays.asList("", null));
        System.out.println(palabras);

    }
}
