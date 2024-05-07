import java.util.Locale;
import java.util.Scanner;

public class CompraDeProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorPago;
        double valorDescontado;
        int opcao;

        System.out.print("Qual valor da sua compra:  R$");
        valorPago = sc.nextDouble();

        System.out.println("1 - > Á Vista ou PIX");
        System.out.println("2 - > Á Vista no crédito");
        System.out.println("3 - > Parcelado no cartão em duas vezes");
        System.out.println("4 - > Parcelado no cartão em três ou mais vezes");
        System.out.print("digite a opcao desejada: ");
        opcao = sc.nextInt();

        if (opcao == 1){
            valorDescontado = valorPago -= (valorPago * 0.15);
            System.out.println("Valor a pagar: R$ " + valorDescontado);
        } else if (opcao == 2) {
            valorDescontado = valorPago -= (valorPago * 0.10);
            System.out.println("Valor a pagar: R$ " + valorDescontado);
        } else if (opcao == 3) {
            System.out.println("Valor a pagar: R$ " + valorPago);
        } else if (opcao == 4) {
            valorDescontado = valorPago += (valorPago * 0.10);
            System.out.println("Valor a pagar: R$ " + valorDescontado);
        } else {
            System.out.println("OPÇÃO INVÁLIDA");
        }


        sc.close();
    }
}
