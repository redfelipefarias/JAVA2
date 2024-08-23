import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("VAMOS VER SE A SOMA DE (A) + (B) É MENOR QUE (C)? ");
        System.out.println("DIGITE UM VALOR PARA A LETRA (A): ");
        int a = l.nextInt();
        System.out.println("DIGITE UM VALOR PARA A LETRA (B): ");
        int b = l.nextInt();
        System.out.println("DIGITE UM VALOR PARA A LETRA (c): ");
        int c = l.nextInt();

        int somaab = a+b;
        if (somaab > c){
            System.out.println("A soma do a e b é maior que c");
            System.out.printf("O resultado é: %d",somaab);
        }
        else {
            System.out.println("A soma do a e b é menor que C");
        }
    }
}
