package Ejercicios_complementarios_lvl2;
import java.util.Scanner;
public class act1_complementarios_lvl2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantCiudades;

        System.out.print("Digite el numero de cuidades que va a ingresar en el ranking: ");
        cantCiudades = scan.nextInt();  

        scan.nextLine();

        String [] ciudades= new String[cantCiudades];

        System.out.println("Ranking de ciudades favoritas.");

        for(int i=0; i<ciudades.length; i++){
            System.out.print("\nPuesto # "+(i+1)+": ");
            ciudades[i]= scan.nextLine();
            
        }

        scan.close();

        System.out.println("\nSu TOP "+cantCiudades+" es:");

        for(int i=0; i<cantCiudades; i++){
            System.out.print("\n#"+(i+1)+" "+ciudades[i]);
        }

    }
    
}
