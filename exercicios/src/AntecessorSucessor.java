import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int antecessor;
        int sucessor;
        int n;

        System.out.print("Insira um número: ");
        n = sc.nextInt();
        antecessor = n - 1;
        sucessor = n + 1;

        System.out.println("O antecessor do número digitado é " + antecessor + " e o sucessor é " + sucessor);
        sc.close();
    }
}
