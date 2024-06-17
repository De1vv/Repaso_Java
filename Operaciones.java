import java.util.Scanner;

public class Operaciones { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double numero1;
        double numero2;
        double resultado = 0;
        String operador;
        
        System.out.println("Ingresa el primer numero");
        numero1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero");
        numero2 = sc.nextDouble(); 
        System.out.println("Ingresa la operacion que quieres realizar siendo (+) Suma, (-) Resta, (*) Multiplicacion y (/) Division ");
        operador = sc.next(); 
        
        // Uso de equals() para comparar cadenas
        if (operador.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operador.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operador.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operador.equals("/")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Error: División por cero no permitida");
                sc.close();
                return;
            }
        } else {
            System.out.println("Operador invalido");
            sc.close();
            return; // Salir del programa si el operador es inválido
        }
        
        System.out.println("El resultado de tu operacion es: " + resultado);    
        sc.close(); // Cerrar el Scanner
    }
}
