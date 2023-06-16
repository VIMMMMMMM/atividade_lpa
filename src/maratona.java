import java.util.Scanner;
public class maratona {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int contador=0,cont;
                int sorteio= scan.nextInt();
                int[]numero=new int[sorteio];
                int[] rep=new int[sorteio];
                cont= sorteio;

        for (int i=0;i<sorteio;i++){
                numero[i]= scan.nextInt();
                rep[0]=numero[i];
                if (rep[0]==numero[i]){
                        cont--;
                        contador++;
                }else {
                        cont--;

                }

        }

        System.out.println(contador);



                }
        }






