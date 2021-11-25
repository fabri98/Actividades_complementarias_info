package Ejercicios;
import java.util.Scanner;
public class act_8_complementario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nombre, direccion,ciudad,edad;

        System.out.print("Ingrese su nombre y apellido:");
        nombre = scan.nextLine();
        System.out.print("Ingrese su edad:");
        edad = scan.nextLine();
        
        System.out.print("Ingrese su direccion:");
        direccion = scan.nextLine();

        System.out.print("Ingrese la cuidad donde vive:");
        ciudad = scan.nextLine();

        scan.close();
        
        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);
    }
    
}
