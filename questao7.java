import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("DIGITE UM NÚMERO AI MEU PATRÃO: ");
        int numero = l.nextInt();

        if (numero %2==0 ){
            System.out.println(numero+5);
        }
        else{
            System.out.println(numero+8);
        }
    }
}
