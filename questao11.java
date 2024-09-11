import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double vp = s.nextDouble();
        System.out.println("Escolha a forma de pagamento (1)A vista em dinheiro ou cheque, 2)a vista no cartão de crédito ou 3)2x no cartão de crédito sem juros ou 4)2x no cartão de crédito com juros no preço da etiqueta 10%):");
        String fp = s.next();
        double vp1 = vp*1.10;
        if (fp.equalsIgnoreCase("dinheiro") || fp.equalsIgnoreCase("cheque") || fp.equalsIgnoreCase("1")){
            System.out.println(vp-(vp*10/100));
        }
        else if (fp.equalsIgnoreCase("a vista do cartão de crédito")|| fp.equalsIgnoreCase("2")) {
            System.out.println(vp-(vp*15/100));
        }
        else if (fp.equalsIgnoreCase("2x no cartão de crédito sem juros") || fp.equalsIgnoreCase("3")) {
            System.out.printf("Você escolheu pagar(%,.2f) em duas vezes sem juros, as parcelas ficarão no valor = %,.2f",vp, vp/2);
        }
        else if (fp.equalsIgnoreCase("4") || fp.equalsIgnoreCase("2x no cartão de crédito com juros")) {
            System.out.printf("Você escolheu pagar(%,.2f) em duas vezes com juros, as parcelas ficarão no valor = %,.2f",vp,vp1/2);
        }
    }
}