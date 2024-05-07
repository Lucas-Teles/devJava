import java.util.Scanner;

public class TrocaValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int temporario;

        System.out.print("Digite valor de A: ");
        a = sc.nextInt();
        temporario = a;
        System.out.print("Digite valor de B: ");
        b = sc.nextInt();

        System.out.println("A - agora é " + (a = b));
        System.out.println("B - agora é " + (b = temporario));





        sc.close();
    }
}
