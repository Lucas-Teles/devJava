import java.util.Scanner;

public class BrincandoComNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();

        if (a == b){
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("O valor de C -> " + c);



        sc.close();
    }
}
