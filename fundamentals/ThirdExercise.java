import java.util.Scanner;
/**
 * Exercício 3 - Cálculo de área de um retângulo.
 * O programa simula um "assistente" que solicita base e altura
 * e imprime a área de um retângulo.
 * 
 * @author Iasmin
 */
public class ThirdExercise {

    /* Método principal que coleta base e altura do usuário
     * e imprime a área do retângulo.
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("HI, I'M MR. CALCULATOR! LET'S CALCULATE THE AREA OF A RECTANGLE!\n");
        System.out.println("Enter the base: ");
        int base = scanner.nextInt();
        
        System.out.println("Enter the height: ");
        int height = scanner.nextInt();
        
        System.out.println("\nAND THE RESULT IS...");
        System.out.println("tutururururutururuturtut");
        System.out.println("***** " + base * height + " *****");
        
        scanner.close();
    }
    
}