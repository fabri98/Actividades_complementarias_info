import java.util.*;
public class Ej_complementario_act3 {

    public static void main(String[] args){
        List<String> palabras = List.of("Batman","barto", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int cont=0;

        for(int i=0; i<palabras.size(); i++){
            palabras.get(i).split(" ");
            if(palabras.get(i).charAt(0)=='B' || palabras.get(i).charAt(0)=='b'){
                cont++;
            }
        } 

        System.out.println("Contador de palabaras con B o b: "+cont);
    }
    
}
