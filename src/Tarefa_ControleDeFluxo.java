import java.util.Scanner;

public class Tarefa_ControleDeFluxo {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double media=0;
            for(int i=0;i<4;i++){
                System.out.println("digite uma nota:");
                double num=s.nextDouble();
                media=num+media;
            }
            media=media/4;
            System.out.println("A media é: " + media);
            if(media>=7) {
                System.out.println("Aprovado");
            } else if (media>=5 && media<7) {
                System.out.println("Recuperação");
            }
            else {
                System.out.println("Reprovado");
            }

        }
    }
