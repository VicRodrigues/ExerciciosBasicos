import java.util.Scanner;

public class LojaTinta {
    void main(){
        Scanner scanner = new Scanner(System.in);

        double coberturaTinta = 6;
        double lataTinta = 18;
        double precoLata = 80;
        double precoGalao = 25;
        double galaoTinta = 3.6;

        System.out.println("Digite o tamanho em M² da área a ser pintada: ");
        double area = scanner.nextDouble();

        double litrosNecessarios = (area / coberturaTinta) * 1.10; //Com os 10% pedidos

        int gNecessarios = (int) Math.ceil(litrosNecessarios / galaoTinta);
        double lNecessarios = litrosNecessarios / lataTinta;

        int lata = (int) Math.ceil(lNecessarios);

        double compraLata = lata * precoLata;
        double compraGalao = gNecessarios * precoGalao;
        int galoesMistos = 0;
        double compraMista = 0;

        if (lNecessarios % 1 > 0) {
            double restante = lNecessarios - (int) Math.floor(lNecessarios);
             galoesMistos = (int) Math.ceil(restante / galaoTinta);
            compraMista = (galoesMistos * precoGalao) + ((int) Math.floor(lNecessarios) * precoLata);
        }

        if (lata == 1) {
            System.out.println("Será necessário " + lata + " lata");
        }else{
            System.out.println("Serão necessários " + lata + " latas");
        }
        if (gNecessarios ==1) {
            System.out.println("Será necessário " + gNecessarios + " galão");
        }else{
            System.out.println("Serão necessários " + gNecessarios + " galões");
        }

        String valorFormatado = String.format("%.2f", compraMista);

        System.out.println("");
        System.out.println("Ao optar por latas, custará: " + compraLata + " Reais");
        System.out.println("Ao optar por galões, custará: " + compraGalao + " Reais");
        System.out.println("Galões: " + galoesMistos);
        System.out.println("Latas: " + (int)Math.floor(lNecessarios));
        System.out.println("Ao comprar galões e latas, custará: " + valorFormatado + " Reais");



    }
}
