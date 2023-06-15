import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lista1;
        int i;
        lista1 = new int[50];
        for (i = 0; i < lista1.length; i++) {
            System.out.println("digite 50 numeros");
            lista1[i] = scan.nextInt();
        }
    inverso(lista1,i);


    }
    public static int[] inverso(int lista1[], int i){
        int[] lista_inv = new int[50];
        for (i = 0; i < lista_inv.length; i++) {
            lista_inv[i] = lista1[49 - i];
            System.out.println(lista_inv[i]+"   " +lista1[i]);

        }
        return lista_inv;
    }

}