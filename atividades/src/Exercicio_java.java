
import java.util.Scanner;
public class Exercicio_java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int media, alunos,i,soma=0;
        System.out.print("Digite a quantidade de alunos: ");
        alunos = scan.nextInt();
        int [] notas= new int [alunos];
       for (i=0; i<alunos;i++) {
           System.out.println("digite a media dos alunos");
           notas[i]= scan.nextInt();
           soma += notas[i];

        }
        media=soma/alunos;
        System.out.println("a media da turma e: "+media);
       for (i=0;i<alunos;i++){
           if(notas[i]>media){
               System.out.println("as notas acima da media sao: "+notas[i]);

           }

        }

    }

}