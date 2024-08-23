import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("COLOQUE UM VALOR AI MEU PATRÃO: ");
        int num1 = l.nextInt();
        System.out.println("COLOQUE UM VALOR DIFERENTE AI MEU PATRÃO: ");
        int num2 = l.nextInt();
        System.out.println("COLOQUE UM VALOR DIFERENTE AI MEU PATRÃO: ");
        int num3 = l.nextInt();
        int maior, meio,menor;
        if (num1>num2 && num1>num3){
           maior=num1;
           if (num2>num3){
               meio=num2;
               menor=num3;
               System.out.printf("A ordem é: %d %d %d",maior,meio,menor);
           }else {
               meio=num3;
               menor=num2;
               System.out.printf("A ordem é: %d %d %d",maior,meio,menor);
           }
        }
        else if (num2>num1 && num2>num3) {
            maior=num2;
            if (num1>num3){
                meio=num1;
                menor=num3;
                System.out.printf("A ordem é: %d %d %d",maior,meio,menor);
            }
            else {
                meio=num3;
                menor=num1;
                System.out.printf("A ordem é: %d %d %d",maior,meio,menor);
            }
        }
        else if (num3>num1 && num3>num2) {
            maior=num3;
            if (num2>num1){
                meio=num2;
                menor=num1;
                System.out.printf("A ordem é: %d %d %d",maior,meio,menor);
            }
            else {
                meio=num1;
                menor=num2;
                System.out.printf("A ordem é: %d %d %d",maior,meio,menor);
            }
        }
    }
}
