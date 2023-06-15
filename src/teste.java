import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lista = new int[50];
        int i;
        System.out.println("digite 50 numeros");
        for (i = 0; i < lista.length; i++) {
            lista[i] = scan.nextInt();
        }
            inverso(lista);
    }
    public static void inverso(int lista[]){
        int i;
        int[] lista_inv = new int[10];
        for (i = 0; i < lista_inv.length; i++) {
            lista_inv[i] = lista[49 - i];
            System.out.println(lista_inv[i]+"   " +lista[i]);

        }
    }

}