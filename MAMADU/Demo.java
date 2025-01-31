package MAMADU;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
       System.out.println("meta os vvalores:"); 
       Scanner scanner = new Scanner(System.in);

       int valor1 = scanner.nextInt();
       int valor2 = scanner.nextInt();
       int valor3 = scanner.nextInt();

       List<Integer> valores = List.of(valor1, valor2, valor3);
      
       
       int maior = Collections.max(valores);
       int menor = Collections.min(valores);

       System.out.println("ente e o maior: " + maior);
       System.out.println("menor "+ menor);
    }
}
