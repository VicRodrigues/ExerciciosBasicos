import java.util.Scanner;

public class PesoIdeal {
    void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura em Metros: ");
        double altura = scanner.nextDouble();
        double peso = 72.7*altura -58;
        System.out.println("Seu peso ideal: " + peso);
    }
}
