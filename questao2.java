import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("QUAL SEU NOME? ");
        String nome = l.next();
        System.out.println("QUAL SEU SEXO? ");
        String sexo = l.next();
        System.out.println("QUAL SEU ESTADO CIVIL? ");
        String estadocivil = l.next();
        if (sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("F") && estadocivil.equalsIgnoreCase("casada")){
            System.out.println("Você é casada a quanto tempo?");
            String etc = l.next();
            System.out.println("Registrada");
        }
        else {
            System.out.println("Registrado(a)");
        }

    }
}