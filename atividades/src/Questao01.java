import java.util.Scanner;
public class Questao01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int conta=300;
		mostraMenu(conta,scan);		
	}
	public static void mostraMenu(int conta, Scanner scan) {
		double[] addSaldo = new double [conta];
		double[] mostraSaldo = new double [conta];
		int i=0, opcao=0,cliente=0;
		while(opcao!=4) {
			System.out.println("qual voce quer? 1 adicionaSaldo 2 mostraSaldo 3 informaDevedores 4 Sair");
		 opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			adicionaSaldo(conta,addSaldo,i, cliente, scan);
			break;
		case 2:
			mostraSaldo(addSaldo, i,conta,mostraSaldo, cliente);
			break;
		case 3:
			devedores(addSaldo,i);
			break;
		case 4: 
			System.out.println("acesso finalizado");
			default:
				System.out.println("digite valor valido");
				break;
		}
		}		
	}
	public static double[] adicionaSaldo(int conta, double[]addSaldo, int i,int cliente, Scanner scan) {
		for(i=0; i<addSaldo.length;i++ ) {
			cliente = i+1;
			System.out.println("digite o saldo do seu cliente: "+cliente);
			addSaldo[i]= scan.nextDouble();
		}
		return addSaldo;
	}
	public static double[] mostraSaldo(double[]addSaldo, int i, int conta, double mostraSaldo[], int cliente ) {
		for(i=0;i<mostraSaldo.length;i++) {
			mostraSaldo[i]=addSaldo[i];
		}
		imprimir(mostraSaldo,i, cliente);
		return mostraSaldo;

	}
	public static void imprimir(double[]mostraSaldo,int i, int cliente) {
		for (i=0; i < mostraSaldo.length; i++) {
			cliente = i+1;
			System.out.println("o saldo da conta "+cliente+" e: "+mostraSaldo[i]);
		}
		
	}
	public static int devedores(double[]addSaldo, int i) {
		int devedor=0;
		for(i=0; i<addSaldo.length;i++) {
			if(addSaldo[i]<0) {
				devedor++;
			}
		} 
		System.out.println("o banco possui "+devedor+" clientes devedores");
		return devedor;
	}

}