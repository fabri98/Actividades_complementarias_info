package Ejercicios_complementarios_lvl2;
import java.util.ArrayList;
import java.util.List;

public class act5_complementario_lvl2 {

public class Ejercicio5{
    public static void main(String args[]){
        List<Integer> horaTrabajo = new ArrayList<>();
        List<Integer> valorHora = new ArrayList<>();
        List<Integer> pagoFinal = new ArrayList<>();
        int horas;

        horaTrabajo.add(6);
        horaTrabajo.add(7);
        horaTrabajo.add(8);
        horaTrabajo.add(4);
        horaTrabajo.add(5);
        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);

        for (int i = 0; i < horaTrabajo.size(); i++) {
            horas = horaTrabajo.get(i) * valorHora.get(i);
            pagoFinal.add(horas);
        }
        int totalHoras = 0;

        for(int i = 0; i < pagoFinal.size(); i++){
            totalHoras += pagoFinal.get(i);
        }
        System.out.println(pagoFinal);
        System.out.println("Pago Final: $" + totalHoras);
    }
}
    
}
