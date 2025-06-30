import java.util.Scanner;
public class FourthExercise {
    // O que o programa deve fazer? 
    /* Receber um primeiro número
     * Receber um segundo número que vai ser dividido pelo primeiro número
     * Analisar se o resto dessa divisão é igual a zero
     * Pedir outro número se o resto for igual a zero
     * Continuar até que o resto da divisão resulte em um número diferente de zero
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int result = 0;
        
        do {
            int secondNumber = scanner.nextInt();
            
            if(firstNumber > secondNumber){
                result = (firstNumber % secondNumber);
                System.out.println(result);
            } else{
                System.out.println("The first number must be higher than the second");
                continue;
            }
            
        } while(result == 0);
        
        System.out.println("Successfully executed");
        scanner.close();
        
    }
}