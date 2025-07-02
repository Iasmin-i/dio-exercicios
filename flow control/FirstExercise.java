import java.util.Scanner;
/*
 * Exercício 1 - Tabuada de um número.
 * Este programa solicita ao usuário um número inteiro
 * e imprime a tabuada de multiplicação de 1 a 10 para esse número.
 * 
 * @author Iasmin
 */
public class FirstExercise {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println();
        
        // Itera dez vezes, multiplicando o número indicado a cada iteração
        for(int i = 1; i <= 10; i++){
            
            System.out.println(number * i);
    }
        scanner.close();
}
}