import java.util.Scanner;
import java.lang.Math; 
/**
 * Exercício 2 - Cálculo de área de um quadrado.
 * 
 * Este programa recebe um número real do usuário representando o lado de um quadrado
 * e calcula sua área utilizando Math.pow.
 * 
 * @author Iasmin
 */
public class SecondExercise {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebe um número inteiro do usuário
        System.out.println("Enter a number: ");
        double side = scanner.nextDouble();
        
        // Calcula a potência quadrada do número recebido
        double area = Math.pow(side, 2);
        System.out.println("Square's area: " + area);
        
        scanner.close();
    }
    
}