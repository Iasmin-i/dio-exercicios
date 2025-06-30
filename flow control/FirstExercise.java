import java.util.Scanner;

public class FirstExercise {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println();
        
        for(int i = 1; i <= 10; i++){
            
            System.out.println(number * i);
        }
    }
    
    // done
}