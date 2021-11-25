import java.util.*;
public class Ej_complementario_act2 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        List<Integer> potencia = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(10);

        for(int i=0;i<numeros.size();i++){
            potencia.add(numeros.get(i)*numeros.get(i));
            
        }
        System.out.println(potencia);
    }
    
}
