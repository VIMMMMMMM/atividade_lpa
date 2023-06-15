import java.util.Scanner;
public class modularizacao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lado_a, lado_b, lado_c;
            System.out.println("digite os 3 lados do triangulo");
            lado_a = scan.nextInt();
            lado_b = scan.nextInt();
            lado_c = scan.nextInt();

        triangulo1(lado_a,lado_b,lado_c);
    }
    public static void triangulo1(int lado_a, int lado_b, int lado_c){
    int soma1, soma2, soma3;
        soma1 = lado_a + lado_b;
        soma2 = lado_b + lado_c;
        soma3 = lado_a+ lado_c;
        if (lado_a<soma2 && lado_b < soma3 && lado_c < soma1){
            System.out.println("forma um triangulo");
            triangulo(lado_a,lado_b,lado_c);
        }else {
            System.out.println("nao forma triangulo");
        }

    }
    public static void triangulo(int lado_a, int lado_b, int lado_c){
        if (lado_a == lado_b && lado_b == lado_c && lado_c == lado_a){
            System.out.println("e equilatero");
        } else if (lado_a != lado_b && lado_b != lado_c && lado_c != lado_a) {
            System.out.println("e escaleno");
        }else {
            System.out.println("e isosceles");
        }
    }

}
