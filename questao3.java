import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        int numero = l.nextInt();

        if(numero%2==0) {
            System.out.println("É PAR!");
        }
        else {
            System.out.println("É IMPAR!");
        }
    }
}
