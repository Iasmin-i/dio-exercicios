import java.util.Scanner;
/*
 * Exercício 3 - Impressão de números pares ou ímpares.
 * 
 * O programa solicita dois números inteiros (primeiro menor, segundo maior)
 * e uma opção (par ou ímpar). Em seguida, imprime todos os números
 * entre os dois valores na ordem decrescente, conforme a opção escolhida.
 * 
 * @author Iasmin
 */
public class ThirdExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number (higher than the first): ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter (E) for even or (O) for odd: ");
        char option = scanner.next().toUpperCase().charAt(0); // transforma em maiúscula
        
        System.out.println("\nNumbers in descending order: ");

        switch (option){
            case 'E' :
                for(int i = secondNumber; i >= firstNumber; i--){
                    // imprime os números divisíveis por 2 (pares)
                    if(i % 2 == 0){
                        System.out.println(i);
                    }
                }
                break;
            case 'O' : 
                for(int i = secondNumber; i >= firstNumber; i--){
                    // imprime os números não divisíveis por 2 (ímpares)
                    if(i % 2 != 0){
                        System.out.println(i);
                    }
                }
                break;
            default : 
                System.out.println("Incorrect input");
        }
        scanner.close();
    }
}