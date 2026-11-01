import java.awt.*;
import java.util.Scanner;

public class PesoIdeal2 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura em Metros: ");
        float altura = scanner.nextFloat();
        System.out.println("Digite seu sexo: ");
        String sexo = scanner.next();
        double pesoIdeal;

    /* Código utilizando "ou", antes de conhecer o método .equalsIgnoreCase
     if (sexo.equals("masculino")  || sexo.equals("Masculino") ) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }
            else if ( sexo.equals("feminino")|| sexo.equals("Feminino")) {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }
            else{
                System.out.println("Entrada Inválida: Sexo.");
        }*/

        if (sexo.equalsIgnoreCase("masculino") ) {
            pesoIdeal = 72.7 * altura - 58;
        }
        else if ( sexo.equalsIgnoreCase("feminino")) {
            pesoIdeal = 62.1 * altura - 44.7;
        }
        else {
            System.out.println("Entrada Inválida: Sexo.");
            return;
        }
        System.out.println("Seu peso ideal é: " + pesoIdeal);

        System.out.println("Informe o seu peso: ");
        double peso = scanner.nextDouble();

        if (peso < pesoIdeal){
            System.out.println("Você está abaixo do peso!");
        }
        else if (peso == pesoIdeal){
            System.out.println("Você está no peso ideal!");
        }
        else{
            System.out.println("Você está acima do peso!");
        }



    }
}
