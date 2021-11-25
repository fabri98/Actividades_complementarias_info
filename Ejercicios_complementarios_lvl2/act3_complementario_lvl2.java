package Ejercicios_complementarios_lvl2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class act3_complementario_lvl2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> baraja = new ArrayList<>();
        String carta;
        
        
        System.out.println("Ingrese en orden los valores de la baraja: \n");
        
        for (int i = 0; i < 13; i++) {
            System.out.print("Carta N°"+(i+1)+": ");
            carta = scan.nextLine();
            baraja.add(i,carta);
        }

        System.out.println("\nCartas ordenadas:");

        for (int i = 0; i < baraja.size(); i++) {
            System.out.print(baraja.get(i)+" - ");
        }


        System.out.println("\nCartas ordenadas la inversa:");

        //Baraja inversa
        for(int i = 12; i >= 0; i--) {
            System.out.print(baraja.get(i)+" - ");
        }

        Collections.shuffle(baraja);

        System.out.println("\nCartas desordenadas:");
        for(int i = 0; i < baraja.size(); i++){
            System.out.print(baraja.get(i)+" - ");
        }

        
    }
    
}
