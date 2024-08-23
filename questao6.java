import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("DIGITA UM VERDADEIRO(true) OU FALSO(false) AI PATRÃO; ");
        boolean vouf = l.nextBoolean();
        System.out.println("DIGITA UM VERDADEIRO(true) OU FALSO(false) AI PATRÃO: ");
        boolean vouf2 = l.nextBoolean();

        if (vouf == vouf2){
            System.out.println("VERDADEIRO MOH VEIH :D");
        }else{
            System.out.println("FALSO MEU VEIH :(");

        }
    }
}
