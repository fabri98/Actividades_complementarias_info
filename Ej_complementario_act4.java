import java.util.*;
public class Ej_complementario_act4 {

    public static void main(String[] args){

        int i=0;
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(4);

        Set<Integer> numeros_unicos = new HashSet<Integer>(numeros);
        numeros.clear();
        numeros.addAll(numeros_unicos);

        
       for(Integer num:numeros){          
           numeros.set(i,fact(num));
           i++;
           
       }
       System.out.println("El factorial de los numeros es: "+numeros);

    }

    public static int fact(int num) {
        int fact=1;
        for(int i = num; i > 0; i--){
            fact *= i;          
        }
        return fact;
    }
    
}
