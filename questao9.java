import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("DIGITE SUA ALTURA: ");
        double altura = l.nextDouble();
        System.out.println("DIGITE SEU SEXO: ");
        String sexo = l.next();
        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")){
            System.out.println((72.7 * altura) - 58);
        } else if (sexo.equalsIgnoreCase("feminino")|| sexo.equalsIgnoreCase("f")) {
            System.out.println((62.1 * altura) - 44.7);


        }


    }
}
