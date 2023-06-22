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
        System.out.print("Dime el número máximo: ");
        max= entrada.nextInt(); entrada.nextLine();
        System.out.println();
        
        maxIntentos= (int)(Math.log(max-min+1)/Math.log(2)+1); //aplico el cálculo logratimo en base 2
    
        System.out.println("EXCELENTE. Adivinaré tu número en no más de "+maxIntentos+" intentos.");
        System.out.print("Presiona ENTER cuando quieras comenzar...");
        entrada.nextLine();
        System.out.println();
        
        adivino= false;
        trampa= false;
        
        for(i= 1; i<=maxIntentos; i++){
            numeroPosible= ((max-min) / 2) + min;
            System.out.print("Intento " +i+ " -> El numero es..."+numeroPosible+": ");
            opcion= entrada.nextLine();
            
            switch(opcion){
                case "=":
                    adivino= true;
                    break;
                case "<":
                    max= numeroPosible-1;
                    break;
                case ">":
                    min= numeroPosible+1;
                    break;
            }
            
            if(adivino)break;
            
            if((min>max) || (max<min)){
                System.out.println("¡¡¡ESTÁS HACIENDO TRAMPA!!!");
                trampa= true;
                break;
            }
        }
        
        if ((i==maxIntentos) && (!adivino) && (!trampa)){
            System.out.println("¡¡GANASTE!! No pude entontrar el número.");
        } else if (adivino){
            System.out.println("¡¡¡GANÉ!!! Pónemelo más difícil");
        }
    }
}
