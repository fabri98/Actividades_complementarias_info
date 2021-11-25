package Ejercicios_complementarios_lvl2;
import java.util.ArrayList;
import java.util.List;

public class ac4_complementario_lvl2 {
    public static void main(String[] args) {
        List<String> clase = new ArrayList<>();

        clase.add("Carlos");
        clase.add("Facundo");
        clase.add("Diego");
        clase.add("Agustin");
        clase.add("Marcela");
        clase.add("Matias");
        clase.add("Sebastian");
        clase.add("Maria");
        clase.add("Rodrigo");
        clase.add("Mario");
        clase.add("Enzo");
        clase.add("Carolina");

        List<String> clase1 = clase.subList(0, 4);
        List<String> clase2 = clase.subList(4, 8);
        List<String> clase3 =clase.subList(8, 12);

        System.out.println("Clase 1\n");
        

        for(int i = 0; i <clase1.size(); i++){
            System.out.println(clase1.get(i));
        }

        System.out.println("\nClase 2\n");
       

        for(int i = 0; i <clase2.size(); i++){
            System.out.println(clase2.get(i));
        }
     
        System.out.println("\nClase 3\n");
        

        for(int i = 0; i <clase3.size(); i++){
            System.out.println(clase3.get(i));
        }
    }
    
}
