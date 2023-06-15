import java.util.Scanner;
public class vetor_array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lista1, lista2;
        int i;
        lista1 = new int[10];
        lista2 = new int[10];
        for (i = 0; i < lista1.length; i++) {
            System.out.println("digite 10 numeros");
            lista1[i] = scan.nextInt();
        }
        for (i = 0; i < lista2.length; i++) {
            System.out.println("digite outros 10 numeros");
            lista2[i] = scan.nextInt();
        }
        soma(lista1,lista2,i);
    }

    public static int[] soma(int lista1[], int lista2[], int i) {
        int[] somador = new int[10];
        for (i = 0; i < somador.length; i++) {
            somador[i] = lista1[i] + lista2[i];
            System.out.println("a soma no ponto " + i + " e: " + somador[i]);
        }
    return somador;
    }
}





