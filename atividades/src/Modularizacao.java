import java.util.Scanner;

public class Modularizacao {
    public static void main(String[] args) {
    fatorial();
    msg("fatorial");
    }
    public static void fatorial() {
        int i, n, m = 0, r;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = n - 1; i != 1; i--) {
            m = i * n;
            System.out.println(m);
            n = m;
        }

    }
    public static void msg(String nome){

        System.out.println("essa e sua "+nome+"!");

    }

}



