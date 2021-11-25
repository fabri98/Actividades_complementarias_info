package Ejercicios;
import java.util.Scanner;
public class act_5_complementario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite el primer numero:");
        num1 = scan.nextInt();
        System.out.print("Digite el segundo numero:");
        num2 = scan.nextInt();
        scan.close();

        
        System.out.println("Resultado de la suma sucesiva:"+sumaSucesiva(num1,num2));
    }

    public static int sumaSucesiva(int num1,int num2) {
        int suma=0;
        for(int i=0; i<num2; i++){            
            suma+=num1;           
        }
        return suma;
    }
    
}
