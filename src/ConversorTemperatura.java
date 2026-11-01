import java.util.Scanner;

public class ConversorTemperatura {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farehnheit: ");
        double tempFar = scanner.nextDouble();
        double tempCel;
        tempCel = 5 * (tempFar-32)/9;

        //coloca o número double em int arredondado para cima
        int inteiroParaCima = (int) Math.ceil(tempCel);
        System.out.println("Sua temperatura em Celsius: " + inteiroParaCima + "ºC");

        System.out.println("Digite a Temperatura em Celsius: ");
        tempCel = scanner.nextInt();
        tempFar = (tempCel*9/5)+32;
        inteiroParaCima = (int) Math.ceil(tempFar);
        System.out.println("Sua temperatura em Farenheit: " + inteiroParaCima + "ºF");
    }
}
