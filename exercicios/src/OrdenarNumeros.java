import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[3];

        System.out.print("Insira os 3 valores inteiros para adicionar: ");
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();


        Arrays.sort(n);

        System.out.println("Números em ordem decrescente:");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
        sc.close();
    }
}
