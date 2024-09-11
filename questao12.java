import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero de idenificação: ");
        int NI = s.nextInt();
        System.out.printf("usuario %s digite sua primeira nota: ",NI);
        double nota1 = s.nextDouble();
        System.out.print("digite a segunda nota: ");
        double nota2 = s.nextDouble();
        System.out.print("digite a terceira nota: ");
        double nota3 = s.nextDouble();

        System.out.printf("digite a media dos exercicios: ");
        double ME = s.nextDouble();

        double MA = (nota1+(nota2*2)+(nota3 * 3)+ ME)/7;

        if (MA >= 9){
            System.out.print("parabens você foi aprovado (condição A)");
        }
        else if (MA >= 7.5 && MA < 9) {
            System.out.print("parabens você foi aprovado (condição B)");
        }
        else if (MA >= 6.0 && MA < 7.5) {
            System.out.print("parabens você foi aprovado (condição C)");
        }
        else if (MA >= 4.0 && MA <= 6.0) {
            System.out.print("você foi reprovado (condição D)");
        }
        else{
            System.out.print("você foi reprovado (condição E)");
        }


    }
}
