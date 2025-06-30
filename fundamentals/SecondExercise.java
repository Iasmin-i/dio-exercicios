import java.util.Scanner;
import java.lang.Math; 

public class SecondExercise {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Recebe um número inteiro do usuário
        System.out.println("Enter a number: ");
        double side = scanner.nextDouble();
        // Calcula a potência quadrada do número recebido
        double area = Math.pow(side, 2);
        System.out.println("Square's area: " + area);
    }
    
}