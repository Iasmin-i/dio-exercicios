import java.util.Scanner;

public class FirstExercise {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Recebe o input dos tipos String e int
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        // Exibe o output no console
        System.out.println("Hello " + name + ", your age is: " + age + " years old");
        
    }
    
}