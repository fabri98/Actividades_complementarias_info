package Ejercicios;
import java.util.Scanner;
public class act_9_complementario {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String texto;
        char caracter;
        int numeroDeVeces = 0;

        
        do {
            System.out.println("Introduce texto: ");
            texto = scan.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = scan.next().charAt(0);
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter => " +caracter + " aparece " + numeroDeVeces + " veces");     
        
        scan.close();
    }

    //calcular el número de veces que se repite un carácter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
}
    

