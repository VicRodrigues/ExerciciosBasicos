import java.util.Scanner;

public class AgendaDois {
    void main (){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        String[][][] agenda = new String[12][31][8]; //apenas 8 horas por dia

        while(continuar) {
            System.out.println("--------Agenda-------");
            System.out.println("Digite a opção:\n" +
                    "1- Inserir/alterar \n" +
                    "2- Consultar \n" +
                    "3- Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira a numeração do mês que deseja alterar: ");
                    int mes = scanner.nextInt() - 1 ;
                    System.out.println("Insira o dia do mês que deseja alterar: ");
                    int dia = scanner.nextInt() - 1 ;
                    System.out.println("Insira a hora: ");
                    int hora = scanner.nextInt() - 1;

                    scanner.nextLine();
                    if (mes >= 0 && mes < agenda.length && dia >= 0 && dia < agenda[0].length && hora >= 0 && hora < agenda[0][0].length) {
                        System.out.println("Digite o compromisso a ser inserido: ");
                        String compromisso = scanner.nextLine();

                        agenda[mes][dia][hora] = compromisso;
                        System.out.println("Compromisso inserido com sucesso no mês " + (mes+1) + ", para o dia " + (dia+1) + " às " + (hora+1) + " horas");
                        System.out.println();
                    } else {
                        System.out.println("Mês, Dia ou hora inválidas.");
                        System.out.println();
                    }

                    break;
                case 2:
                    System.out.println("Insira a numeração do mês que deseja alterar: ");
                    mes = scanner.nextInt() - 1;
                    System.out.println("Insira o dia do mês que deseja Consultar: ");
                    dia = scanner.nextInt() - 1;
                    System.out.println("Insira a hora:");
                    hora = scanner.nextInt() - 1;

                    String consulta = agenda[mes][dia][hora];

                    if (consulta == null) {
                        System.out.println("Nenhum compromisso agendado nesta data.");
                        System.out.println();
                    } else {
                        System.out.println("Compromisso agendado: " + consulta);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Fechando agenda!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
