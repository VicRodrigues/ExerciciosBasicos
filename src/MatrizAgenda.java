import java.util.Scanner;

public class MatrizAgenda {
    void main (){
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        String[][] agenda = new String[31][24];

        while(continuar) {
            System.out.println("--------Agenda-------");
            System.out.println("Digite a opção:\n" +
                    "1- Inserir/alterar \n" +
                    "2- Consultar \n" +
                    "3- Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o dia do mês que deseja alterar: ");
                    int dia = scanner.nextInt();
                    System.out.println("Insira a hora:");
                    int hora = scanner.nextInt();

                    scanner.nextLine();
                    if (dia >= 0 && dia < agenda.length && hora >= 0 && hora < agenda[0].length) {
                        System.out.println("Digite o compromisso a ser inserido: ");
                        String compromisso = scanner.nextLine();

                        agenda[dia][hora] = compromisso;
                        System.out.println("Compromisso inserido com sucesso para o dia " + dia + " às " + hora + " horas");
                        System.out.println();
                    } else {
                        System.out.println("Dia e hora inválidas.");
                        System.out.println();
                    }

                    break;
                case 2:
                    System.out.println("Insira o dia do mês que deseja Consultar: ");
                    dia = scanner.nextInt();
                    System.out.println("Insira a hora:");
                    hora = scanner.nextInt();

                    String consulta = agenda[dia][hora];

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
