import java.util.Scanner;

public class Calculos{
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 2 números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Digite 1 número real: ");
        double num3 = scanner.nextDouble();

        double resultadoA = num1*2+num2/2;
        double resultadoB = num1*3 + num3;
        double resultadoC = num3*num3*num3;
        System.out.println("O produto do primeiro com a metade do segundo: " + resultadoA);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + resultadoB);
        System.out.println("O terceiro ao cubo: " + resultadoC);
    }
}
