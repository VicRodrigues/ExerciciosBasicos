import java.util.Random;
import java.util.Scanner;

public class Matriz1 {
    void main(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] array = new int[4][4];
        int linha = Integer.MIN_VALUE;
        int coluna = Integer.MIN_VALUE;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);

            }
        }
        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[i].length; j++){

                if (array[i][j] > maior) {

                    maior = array[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior valor da matriz: " + maior);
        System.out.println("se encontra na linha: " + linha);
        System.out.println("se encontra na coluna: " + coluna);

    }
}
