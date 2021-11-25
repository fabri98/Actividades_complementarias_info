package Ejercicios;
import java.util.Scanner;

public class act_7_complementario {
    public static void main(String[] args){
        String mayuscula;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su palabra en minuscula: ");
        mayuscula = scan.nextLine();
        System.out.println("\n"+convertMayus(mayuscula));
    }

    static String convertMayus(String letra){
        String resultado = "";
        char texto = ' ';

        for (int i = 0; i < letra.length(); i++) {
            if(letra.charAt(i)>='a'&& letra.charAt(i) <= 'z'){
                texto = (char)(letra.charAt(i) - 32);
            }
            else{
                texto = (char)(letra.charAt(i));
            }
            resultado += texto;
        }
        return resultado;
    }
    
}
