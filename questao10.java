import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("SEU PESO: ");
        double peso = l.nextDouble();
        System.out.println("SUA ALTURA:");
        double altura = l.nextDouble();
        double imc = peso / (altura*altura);

        if (imc<18.5){
            System.out.println("ABAIXO DO PESO");
        } else if (imc>18.5 && imc<25) {
            System.out.println("PESO NORMAL");
        } else if (imc>25 && imc<30) {
            System.out.println("ACIMA DO PESO");
        }
        else{
            System.out.println("OBESO");
        }
    }
}
