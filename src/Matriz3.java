import java.util.Scanner;

public class Matriz3 {
    void main(){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i =0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Entre com um valor: ");
                matriz[i][j] = scanner.nextInt();
            }

        }
        for (int i =0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int somaPares = 0;
        int somaImpares = 0;

       for (int i =0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] % 2 ==0 ){
                somaPares++;
                }else {
                    somaImpares++;
                }
            }

        }
        System.out.println("A matriz possui "+ somaPares + " números pares");
        System.out.println("A matriz possui "+ somaImpares + " números ímpares");
    }
}
