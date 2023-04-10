
        import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem-vindo à calculadora Java!");
        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();
        
        System.out.println("Digite a operação (+, -, *, /): ");
        String operacao = input.next();
        
        double resultado = 0;
        
        switch(operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        
        System.out.println("O resultado é: " + resultado);
    }
}


