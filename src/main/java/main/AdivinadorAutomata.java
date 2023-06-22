package main;

import java.util.Scanner;

public class AdivinadorAutomata {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        
        String opcion;
        boolean adivino, trampa;
        int min, max, i, maxIntentos, numeroPosible;
        
        System.out.println("Intentaré adivinar un número que tu elijas.");
        System.out.println("Cuando indique un número tu deberás ingresar:");
        System.out.println("\t= si acierto al número que tu quieres que adivine.");
        System.out.println("\t> si el número que tu quieres que adivine es mayor al que mostré");
        System.out.println("\t< si el número que tu quieres que adivine es menor al que mostré");
        System.out.print("Dime el número mínimo: ");
        min= entrada.nextInt();entrada.nextLine();
        System.out.print("Dime el número máximo:: ");
        max= entrada.nextInt(); entrada.nextLine();
    }
}
