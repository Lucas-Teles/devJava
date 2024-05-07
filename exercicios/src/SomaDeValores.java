public class SomaDeValores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 14;

        int soma = a + b;

        System.out.println("Soma de " + a + " + " + b + " = " + soma);
        if (soma > c){
            System.out.println("A soma é maior que " + c);
        } else {
            System.out.println("A soma é menor que " + c);
        }
    }
}
