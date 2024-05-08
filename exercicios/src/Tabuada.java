public class Tabuada {
    public static void main(String[] args) {
        int n = 10;
        int soma;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                soma = i + j;
                System.out.println(i + " + " + j + " = " + soma);
            }
            System.out.println("+-+-+-+-+-+-+");
        }
    }
}
