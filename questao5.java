import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("DIGITE UM NÚMERO: ");
        int numero = l.nextInt();

        if (numero > 0) {
            System.out.println(numero*2);
        } else if (numero < 0) {
            System.out.println(numero*3);

        }
    }
}
