import java.util.Scanner;

public class Salario {
    void main (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora: ");
        double salHora = scanner.nextDouble();
        System.out.println("Quantas horas você trabalha ao mês: ");
        int horas = scanner.nextInt();

        double salBruto = salHora * horas;
        System.out.println("Salário bruto: " + salBruto + " Reais");

        double inss = (salBruto * 8)/100;
        double iRenda = (salBruto * 11)/100;
        double sindicato = (salBruto * 5)/100;
        double salLiquido = salBruto - inss - iRenda - sindicato;

        System.out.println("Valor gasto com INSS: " + inss + " Reais");
        System.out.println("Valor gasto com Imposto de Renda: " + iRenda + " Reais");
        System.out.println("Valor gasto com Sindicato: " + sindicato + " Reais");
        System.out.println("Salário líquido: " + salLiquido + " Reais");

    }
}
