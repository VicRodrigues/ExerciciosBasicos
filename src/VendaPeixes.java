import java.util.Scanner;

public class VendaPeixes {
    void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Peso do peixe em Quilos: ");
        double peso = scanner.nextDouble();

        double excesso = 0.00;
        double multa = 0.00;

        if ( peso >= 50 ){
            excesso = peso - 50;

            multa = excesso * 4;

            System.out.println("O peso excedeu o limite de 50 quilos: ");
            System.out.println("Excedeu: " + excesso + " Quilos");
            System.out.println("Multa: " + multa +" Reais");

        }else{
            System.out.println("Não houve excesso no peso: " + excesso);
            System.out.println("Multa: " + multa + " Reais");

            return;
        }
    }
}

