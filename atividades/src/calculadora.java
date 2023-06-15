import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        int calculadora=0;
        Scanner sc = new Scanner(System.in);

        while (calculadora != 5){
            System.out.println("qual vc quer? 1 soma,2 subtracao, 3 divisao, 4 multiplicao, 5 sair");
            calculadora= sc.nextInt();
        switch (calculadora) {
            case 1:
                soma();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                divisao();
                break;
            case 4:
                multiplicao();
                break;
            default:
                System.out.println("encerrado");
                break;
        }
        }
    }
    public static int soma(){
        int soma, numero1, numero2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite dois numeros:");
        numero1= sc.nextInt();
        numero2= sc.nextInt();
        soma = numero1+numero2;
        System.out.println("soma:"+soma);
        return soma;
    }
    public static double multiplicao(){
        double multiplicao, numero1, numero2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite dois numeros:");
        numero1= sc.nextDouble();
        numero2= sc.nextDouble();
        multiplicao = numero1*numero2;
        System.out.println("multiplicao:"+multiplicao);
        return multiplicao;
    }
    public static double divisao(){
        double divisao,numero1,numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite dois numeros:");
        numero1= sc.nextDouble();
        numero2= sc.nextDouble();
        divisao = numero1/numero2;
        System.out.println("divisao:"+divisao);
        return divisao;
    }
    public static int subtracao(){
        int subtracao, numero1, numero2;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite dois numeros:");
        numero1= sc.nextInt();
        numero2= sc.nextInt();
        subtracao = numero1-numero2;
        System.out.println("subtracao:"+subtracao);
        return subtracao;
    }

}
