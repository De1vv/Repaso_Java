
import java.util.Scanner;

public class IngresarDatos {
     
    public static void main(String[] args) {
        String Nombre; 
        String Apaterno; 
        String Amaterno;
        int edad; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingresa tu nombre");
        Nombre = sc.next(); 
        System.out.println("Ingresa tu Apelldo Paterno");
        Apaterno = sc.next();
        System.out.println("Ingresa tu Apellido Materno");
        Amaterno = sc.next(); 
        System.out.println("Ingresa la Edad");
        edad = sc.nextInt(); 
        
        if (edad >= 18)
            System.out.println("Eres mayor de edad");
        else 
            System.out.println("Eres menor de edad");
    }
}
