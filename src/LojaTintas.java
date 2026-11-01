import java.util.Scanner;

public class LojaTintas {
    void main(){
        Scanner scanner = new Scanner(System.in);

        double coberturaLitro = 3;
        double precoLata = 80;
        double litroLata = 18;

        System.out.println("Qual tamanho em M² da parede a ser pintada: ");
        double area = scanner.nextDouble();

        double litroNecesario = area / coberturaLitro;

        int latas = (int) Math.ceil(litroNecesario / litroLata);

        double precoTotal = latas * precoLata;

        System.out.println("Litros necessários: " + litroNecesario);
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Preço total: R$ " + precoTotal);
        }

    }

