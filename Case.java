import java.util.Scanner;
public class Case{ 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int answer = 0; 
        System.out.println("Ingresa el numero");
        int num1 = leer.nextInt();
        System.out.println("Ingresa otro numero");
        int num2 = leer.nextInt(); 
        System.out.println("Ingresa la operacion que deseas realizar");
        System.out.println("Siendo + (Suma), - (Resta)");
        System.out.println("* (Multiplicacion) y / (Division)");
        char digito = leer.next().charAt(0); 
        switch(digito){
            case '+': 
            answer = num1 + num2; 
            break; 
            case '-':
            answer = num1 - num2; 
            break; 
            case '*':
            answer = num1 * num2; 
            break;
            case '/':
            answer = num1 / num2; 
            break; 
            default: 
            System.out.println("Comando invalido"); 

        } 
        System.out.println("El resultado es:" + answer);

        

    }
}