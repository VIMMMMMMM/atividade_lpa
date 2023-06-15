
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int i, j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.println("digite um numero");
                matriz[i][j] = scan.nextInt();
            }
        }
        diagonalp(matriz);
        repeticao(matriz,scan);
    }

    public static void diagonalp(int[][] matriz) {
int i,j;
        System.out.println("diagonal princial: ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (i - j == 0) {
                    System.out.println(matriz[i][j]);
                }


            }
        }

    }

    public static void repeticao(int[][] matriz, Scanner scan) {
        int numero,repetidor=0,i,j;
        System.out.println("digite outro numero");
        numero = scan.nextInt();
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (numero == matriz[i][j]) {
                    repetidor++;
                }
            }
        }
        System.out.println("esse numero aparece "+repetidor+" vez"+(repetidor>1?"es":""));
    }
}