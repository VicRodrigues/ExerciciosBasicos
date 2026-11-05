import java.util.Random;

public class Matriz2 {
    void main() {
        Random random = new Random();

        int[][] array = new int[10][10];
        int linha = Integer.MIN_VALUE;
        int coluna = Integer.MIN_VALUE;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Linha 5:");
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

                if (array[4][j] > maior){
                    maior = array[4][j];
                }
                if (array[4][j] < menor){
                    menor = array[4][j];
                }
            }
        }
        System.out.println();
        System.out.println("maior valor da linha 5: " + maior);
        System.out.println("menor valor da linha 5: " + menor);

        System.out.println();
        System.out.println("Linha 7: ");
        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

                if (array[6][j] > maior){
                    maior = array[6][j];
                }
                if (array[6][j] < menor){
                    menor = array[6][j];
                }
            }
        }
        System.out.println();
        System.out.println("maior valor da linha 7: " + maior);
        System.out.println("menor valor da linha 7: " + menor);
    }
}

