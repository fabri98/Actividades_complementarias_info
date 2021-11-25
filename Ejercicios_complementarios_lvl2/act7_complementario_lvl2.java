package Ejercicios_complementarios_lvl2;
import java.util.ArrayList;
import java.util.Scanner;

public class act7_complementario_lvl2 {
    
    public static void main(String args[]) {
        int num1;
        int num2;
        ArrayList<String> sumaTotal = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros, el primero debe ser menor que el segundo: ");

        System.out.print("Ingrese el primer numero: ");
        num1 = scan.nextInt();
	 
        System.out.print("Ingrese el segundo numero: ");
        num2 = scan.nextInt();

        scan.nextLine();
        System.out.println("");

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sumaTotal.add("FizzBuzz");
            } else if (i % 3 == 0) {
                sumaTotal.add("Buzz");
            }else if (i % 2 == 0) {
                sumaTotal.add("Fizz");
            }else{
                sumaTotal.add(i+"");
            }
    }

    scan.close();
    System.out.println(sumaTotal);

    }
}


    

