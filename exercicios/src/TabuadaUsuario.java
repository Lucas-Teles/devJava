import java.util.Locale;
import java.util.Scanner;

public class TabuadaUsuario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n;
        int soma;

        System.out.print("Insira um numero: ");
        n = sc.nextInt();

        System.out.println("Tabuada de soma do numero: " + n);
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                soma = i + j;
                System.out.println(i + " + " + j + " = " + soma);
            }
            System.out.println("------- -------");
        }

    }
}
