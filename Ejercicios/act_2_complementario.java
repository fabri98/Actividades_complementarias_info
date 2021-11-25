package Ejercicios;
import java.util.Scanner;
public class act_2_complementario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite el primer numero:");
        num1 = scan.nextInt();
        System.out.println("Digite el segundo numero:");
        num2 = scan.nextInt();
        scan.close();

        System.out.println("El resultado de la suma es:"+Suma(num1,num2));
        System.out.println("El resultado de la resta es:"+Resta(num1,num2));
        System.out.println("El resultado de la multiplicacion es:"+Mult(num1,num2));
        
        if(Div(num1,num2)==0){
            System.out.println("El primer numero debe ser mayor que el segundo."+
            "No se pudo realizar la division.");
        }else{
            System.out.println("El resultado de la division es:"+Div(num1,num2));
        }
        System.out.println("El resultado del modulo es:"+Mod(num1,num2));

    }

    public static int Suma(int num1,int num2) {
        int suma = 0;
        suma = num1 + num2;
        return suma;
    }

    public static int Resta(int num1,int num2) {
        int resta = 0;
        resta = num1 - num2;
        return resta;
    }
    public static int Mult(int num1,int num2) {
        int mult = 0;
        mult = num1 * num2;
        return mult;
    }
    public static int Div(int num1,int num2){
        int div = 0;
         if (num1 >= num2){
             div = num1/num2;
                return div;
         }
            else {
                return 0;
            }  
    }
    public static int Mod(int num1,int num2){
        int mod = 0;
        mod = num1 % num2;
        return mod;
    }
}
