package Ejercicios_complementarios_lvl2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class act2_complementario_lvl2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        int numInicio, numFinal, addNum;

        System.out.println("Ingrese 5 numeros:");

        for(int i = 0; i < 5; i++){
            System.out.print((i+1)+": ");
            addNum = scan.nextInt();
            numeros.add(i, addNum);
        }

        System.out.print("\nIngrese un numero para insertar al principio de la lista: ");
        numInicio = scan.nextInt();
        numeros.add(0, numInicio);

        System.out.print("\nIngrese un numero para insertar al final de la lista: ");
        numFinal = scan.nextInt();
        numeros.add(6, numFinal);

        scan.close();


        for(int i=0; i<numeros.size(); i++) {
            System.out.print(" "+numeros.get(i));
        }



    }
    

    

}
