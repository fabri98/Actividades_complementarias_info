package Ej_complementario_act5;
import java.util.*;
import java.util.Iterator;
import java.time.*;
import java.time.temporal.TemporalAccessor;

public class Alumnos{
 public String apellido;
 public String nombre;
 public LocalDate fechaDeNacimiento;


public Alumnos(String apellido, String nombre, LocalDate fechaDeNacimiento) {
    this.apellido = apellido;
    this.nombre = nombre;
    this.fechaDeNacimiento = fechaDeNacimiento;
}

    //Metodo Main
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String nombre;

      Alumnos a1= new Alumnos("Messi", "Lionel", LocalDate.of(1987, 03, 15));
      Alumnos a2= new Alumnos("Ronaldo", "Cristiano", LocalDate.of(1984, 06, 25));
      Alumnos a3= new Alumnos("Paredes", "Leandro", LocalDate.of(1990, 03, 18));
      Alumnos a4= new Alumnos("Tevez", "Carlos", LocalDate.of(1984, 12, 15));
      Alumnos a5= new Alumnos("Perez", "Enzo", LocalDate.of(1980, 07, 17));

      
       Map<String,LocalDate> alumnos = new HashMap<String,LocalDate>();
       

       alumnos.put(a1.apellido+" "+a1.nombre, a1.fechaDeNacimiento);
       alumnos.put(a2.apellido+" "+a2.nombre, a2.fechaDeNacimiento);
       alumnos.put(a3.apellido+" "+a3.nombre, a3.fechaDeNacimiento);
       alumnos.put(a4.apellido+" "+a4.nombre, a4.fechaDeNacimiento);
       alumnos.put(a5.apellido+" "+a5.nombre, a5.fechaDeNacimiento);


        System.out.println("----Lista de Alumnos----");
       for (Map.Entry<String, LocalDate> a : alumnos.entrySet()) {
        System.out.println(a.getKey()); 
    }

       System.out.println("\nDigite el apellido y nombre del alumno que desea saber su fecha de nacimiento:");
       nombre = scan.nextLine();

       if(alumnos.containsKey(nombre)==true){
            System.out.println(nombre+": "+alumnos.get(nombre));

       }else{
          System.out.println("El nombre no existe.");
       }

       
   }
}
    

