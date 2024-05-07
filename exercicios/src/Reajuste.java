import java.util.Locale;
import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n;
        double reajuste = 0.05;

        System.out.print("Digite um valor:  ");
        n = sc.nextDouble();
        System.out.println("Reajuste realizado . . . ");
        System.out.printf("Valor reajustado %.2f",(n += n * reajuste));

        sc.close();

    }
}
