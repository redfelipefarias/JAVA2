import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR INTEIRO PARA A LETRA (A): ");
        int a = l.nextInt();
        System.out.println("DIGITE UM VALOR INTEIRO PARA A LETRA (B): ");
        int b = l.nextInt();

        if (a == b){
            System.out.println("O VALOR DO C É " + (a+b));
        }
        else if (a!=b) {
            System.out.println("O VALOR DO C É " +(a*b));

        }

    }
}
