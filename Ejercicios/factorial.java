package Ejercicios;
import java.util.Scanner;

public class factorial {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite un numero:");
        int num = scan.nextInt();
        scan.close();
        
        System.out.println("El factorial del numero es: "+ fact(num));

    }

    public static int fact(int num) {
        int fact=1;
        for(int i = num; i > 0; i--){
            fact *= i;          
        }
        return fact;
    }
    
}
