import java.util.Scanner;
/**
 * Exercício 1 - Entrada básica de dados.
 * 
 * Este programa solicita ao usuário seu nome e idade,
 * e exibe uma mensagem formatada com essas informações.
 * 
 * @author Iasmin
 */
public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Hello " + name + ", your age is: " + age + " years old");
        
        scanner.close();
    }
}

