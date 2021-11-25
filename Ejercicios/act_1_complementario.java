package Ejercicios;
import java.util.Scanner;
public class act_1_complementario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = "";

        System.out.println("Ingrese su nombre:");
        nombre = scan.nextLine();

        scan.close();

        System.out.println("Hola "+nombre);



    }
    
}
