import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        if (n % 2 == 0 && n < 0) {
            System.out.println(n + " é par e negativo");
        }
        else if (n % 2 == 0 && n > 0) {
            System.out.println(n + " é par e positivo");
        }
        else if (n % 2 != 0 && n > 0) {
            System.out.println(n + " é ímpar e positivo");
        } else if (n % 2 != 0 && n < 0) {
            System.out.println(n + " é ímpar e negativo");
        }

        sc.close();
    }

}
