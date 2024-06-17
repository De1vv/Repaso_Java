//En este programa se realizara la conversion de de galones a litros 
import java.util.Scanner;

public  class Conversion{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
       double Galones; 
       double Diferencia = 3.78541178; 
       double Resultado; 
       System.out.println("Ingrese los galones que quiereconvertir a litros"); 
       Galones = sc.nextDouble();
       System.out.println("El numero de galones a convertir es: " + Galones);
       Resultado  = (Galones*Diferencia); 
       System.out.println("El resutado de la conversion es: " + Resultado);



    }
    

}