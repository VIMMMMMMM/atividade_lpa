import java.util.Scanner;
public class calculadora2 {
public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int calculadora;
    do{
    System.out.println("digite um numero");
    int numero1 = scan.nextInt();
    System.out.println("digite outro numero");
    int numero2 = scan.nextInt();
    System.out.println("SOMA(1)");
    System.out.println("SUBTRACAO(2)");
    System.out.println("MULTIPLICACAO(3)");
    System.out.println("DIVISAO(4)");
    System.out.println("TROCAR VALORES(5)");
    System.out.println("SAIR(6)");
    calculadora = scan.nextInt();
    switch (calculadora) {
        case 1:
            soma(numero1, numero2);
            break;
        case 2:
            subtracao(numero1, numero2);
            break;
        case 3:
            multiplicacao(numero1, numero2);
            break;
        case 4:
            divisao(numero1, numero2);
            break;
        case 5:
            trocar_valores(calculadora);
            break;
        case 6:
            System.out.println("finalizado");
            break;
        default:
            System.out.println("digite um valor valido");
            break;
    }
    }while (calculadora!=6);

}
public static void soma(int numero1, int numero2){
int soma = numero1+numero2;
System.out.println("a soma e: "+soma);
}
    public static void subtracao(int numero1, int numero2){
    int subtracao = numero1-numero2;
    System.out.println("a subtracao e:"+subtracao);
    }
    public static void multiplicacao(double numero1, double numero2){
        double multiplicacao = numero1*numero2;
        System.out.println("a multiplicacao e:"+multiplicacao);
    }
    public static void divisao(double numero1, double numero2){
        double divisao = numero1/numero2;
        System.out.println("a divisao e:"+divisao);
    }
    public static int trocar_valores( int calculadora){
        return calculadora;
    }
}
