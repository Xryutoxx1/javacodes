import java.util.Scanner;


public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("calculadora java! ");
        System.out.println("================================");
        System.out.print("digite um numero: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("digite outro numero: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("digite 1 para soma\ndigite 2 para subtracao\ndigite 3 para multiplicacao\ndigite 4 para divisao");
        int var = scanner.nextInt();
        scanner.nextLine();
        System.out.println("================================");

        switch (var ) {
            case 1:
                System.out.printf("%f + %f = %f ", num1,num2, num1 + num2);  
                break;
            
            case 2:
                System.out.printf("%f - %f = %f ", num1,num2, num1 - num2);  
                break;
            case 3:
                System.out.printf("%f * %f = %f ", num1,num2, num1 * num2);  
                break;

            case 4:
                if (num1 == 0 || num2 == 0) {
                    System.out.println("divisao nao pode ser feita por 0");
                    break;
                }
                else{
                System.out.printf("%f / %f = %f ", num1,num2, num1 / num2);  
                break;}
        }

    }
    
}