import java.util.Scanner;
/*
 * Exercício 4 - Validação de divisão com resto diferente de zero.
 * 
 * O programa solicita dois números inteiros. Enquanto o resto da divisão
 * entre eles for zero, ele continua pedindo novos valores. Finaliza apenas
 * quando o resto da divisão for diferente de zero.
 * 
 * Regra: O primeiro número deve ser maior que o segundo.
 *
 * @author Iasmin
 */
public class FourthExercise {
    // O que o programa deve fazer? 
    /* Receber o primeiro número.
     * Receber o segundo número, que vai ser dividido pelo primeiro.
     * Analisar se o resto dessa divisão é igual a zero.
     * Pedir outro número se o resto for igual a zero, e dividir pelo primeiro novamente.
     * Continuar até que o resto da divisão resulte em um número diferente de zero.
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
            
        } while(result == 0); // Continue enquanto o módulo for igual a zero
        
        System.out.println("Successfully executed");
        scanner.close();
        
    }
}