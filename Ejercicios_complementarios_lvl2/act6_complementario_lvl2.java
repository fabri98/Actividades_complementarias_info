package Ejercicios_complementarios_lvl2;
import java.util.*;
public class act6_complementario_lvl2 {

    public static void main(String[] args) {

        HashSet<Employee> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleado.add(new Employee("Marcos Rojo", 42232124, 6, 350));
        empleado.add(new Employee("Roman Riquelme", 94597168, 7, 345));
        empleado.add(new Employee("Elsa Lame", 43518616, 8, 550));
        empleado.add(new Employee("Michael Scott", 13585210, 4, 600));
        empleado.add(new Employee("Mario Ruiz", 946146310, 5, 320));

        System.out.println("Salario de los empleados\n");

        for (Employee lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee tabla : empleado) {
            salario.put(tabla.clave(), tabla.valor());
        }
        System.out.println("\nSalario Total:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
    }
}
    
