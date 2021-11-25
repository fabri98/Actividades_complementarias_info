import java.util.Scanner;
public class App {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite el primer numero:");
        num1 = scanner.nextInt();
        System.out.println("Digite el segundo numero:");
        num2= scanner.nextInt();

        System.out.println("Resultado: "+Suma(num1,num2));

        scanner.close();
       
    }

public static int Suma(int num1 ,int num2){
        int suma = num1 + num2;
        return suma;
    }

}

