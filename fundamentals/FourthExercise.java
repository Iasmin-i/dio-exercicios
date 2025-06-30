import java.util.Scanner;
public class FourthExercise {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name1bro = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age1bro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second person's name: ");
        String name2bro = scanner.nextLine();
        System.out.println("Enter the second person's age: ");
        int age2bro = scanner.nextInt();
        
        if (age1bro > age2bro){ // Verifica se a primeira idade é maior que a segunda
            //Calcula a maior idade (primeiro) menos a menor (segunda)
            int ageDifference = age1bro - age2bro;
            System.out.println("The age difference between " + name1bro + " and " + name2bro + " is: " + ageDifference + " years");
        } else { // Se a segunda idade for maior, calcula a maior idade (segunda) menos a menor (primeira)
            int ageDifference = age2bro - age1bro;
            System.out.println("The age difference between " + name1bro + " and " + name2bro + " is: " + ageDifference + " years");
        }
        
        
        
    }
    
}