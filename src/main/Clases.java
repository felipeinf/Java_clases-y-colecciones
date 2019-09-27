package main;

import java.util.Scanner;
import model.Coleccion;
import model.Persona;

/**
 *
 * @author Felipe Concha Almeida
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner;
        String lectura;
        
        Coleccion coleccionPersonas;
        int totalPersonas;
        
        Persona persona;
        
        String rut;
        String nombre;
        int añoNacimiento;

        coleccionPersonas = new Coleccion();
        scanner = new Scanner(System.in); //Se instancia el objeto scanner el cual utilizaremos para leer desde el input(System.in).

        System.out.print("Por favor ingrese el total de personas: ");
        lectura = scanner.nextLine();
        totalPersonas = Integer.parseInt(lectura);

        for(int i = 0;  i < totalPersonas;  i++, System.out.print("\n")){
            
            System.out.print("Por favor ingrese el rut de la persona "+ (i+1) + " :");
            lectura = scanner.nextLine();
            rut = lectura;
            
            System.out.print("Por favor ingrese el nombre de la persona "+ (i+1) + " :");
            lectura = scanner.nextLine();
            nombre = lectura;
            
            System.out.print("Por favor ingrese el año de nacimiento de la persona "+ (i+1) + " :");
            lectura = scanner.nextLine();
            añoNacimiento = Integer.parseInt(lectura);
            
            //Al utilizar new en cada iteracion se crea una nueva instancia de un objeto.
            persona = new Persona(rut, nombre, añoNacimiento);

            coleccionPersonas.agregar(persona);
        }
  
        scanner.close();
        
        for(int i = 0;  i < coleccionPersonas.totalElementos();  i++){
         
            //Como nuestra coleccion es de tipo Object, debemos hacer casting para poder acceder a las propiedades de persona.
            persona = (Persona) coleccionPersonas.obtenerElemento(i);
            
            System.out.println("Nombre: " + persona.nombre + " ; RUT: " + persona.rut + " ; Edad: " + persona.calcularEdad());
        }
    
    }
}
