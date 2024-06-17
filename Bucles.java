import java.util.Scanner;

public class Bucles { 
    public static void main(String[] args) {
        boolean exit = false; 
        int valor1, valor2, respuesta = 0; 
        char operador; 
        Scanner sc = new Scanner(System.in); 
        
        do { 
            System.out.println("Ingrese el primer valor:");
            valor1 = sc.nextInt();
            
            System.out.println("Ingrese el segundo valor:");
            valor2 = sc.nextInt();

            System.out.println("Ingrese un operador matematico");
            System.out.println("Siendo: ");
            System.out.println("+ (Suma)");
            System.out.println("- (Resta)");
            System.out.println("* (Multiplicacion)");
            System.out.println("/ (Division)");
            operador = sc.next().charAt(0); 

            switch (operador) {
                case '+': 
                    respuesta = valor1 + valor2; 
                    break;
                case '-': 
                    respuesta = valor1 - valor2;
                    break;
                case '*': 
                    respuesta = valor1 * valor2; 
                    break;
                case '/': 
                    if (valor2 != 0) {
                        respuesta = valor1 / valor2; 
                    } else {
                        System.out.println("Error: División por cero no permitida");
                        continue; // Volver al inicio del bucle
                    }
                    break;
                default:
                    System.out.println("Dato incorrecto");
                    continue; // Volver al inicio del bucle
            }

            System.out.println("El resultado de tu operación es: " + respuesta);

            System.out.println("¿Salir? Y/N");
            if (sc.next().equalsIgnoreCase("Y")) {
                exit = true; 
            }
        } while (!exit);

        sc.close();
    }
}
