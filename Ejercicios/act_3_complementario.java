package Ejercicios;
import java.util.Scanner;
public class act_3_complementario {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num;
  
        System.out.print("Digite un numero:");
  
        num=scan.nextInt();
        scan.close();
        
        Secuencia(num);
               
    }
    
    public static void Secuencia(int num){
        for(int i=0; i<=num; i++){
            for(int j=1; j<=i;j++){
                System.out.print(""+j);
            }
            System.out.println();
   
        }
    }
}    
