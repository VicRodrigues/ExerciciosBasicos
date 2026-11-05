import java.util.Scanner;

public class MaiorNumero {
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maior = 0;
        int menor = 0;
        if (num1 > num2) {
        maior = num1;
        menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }
        if (maior > num3){
            if (menor > num3){
                menor = num3;
                System.out.println("Menor número: " + menor);
            }else{
                System.out.println("Menor número: " + menor);
            }
            System.out.println("Maior número: " + maior);

        }else{
            maior = num3;
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }

    }
}
