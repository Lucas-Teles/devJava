import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.print("Insira seu peso: ");
        peso = sc.nextDouble();
        System.out.print("Insira sua altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc <= 18.5){
            System.out.printf("Seu imc é %.2f", imc);
            System.out.println(" Você está abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.printf(" Seu imc é %.2f", imc);
            System.out.println(" Você está no peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.printf("Seu imc é %.2f", imc);
            System.out.println(" Você está levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf("Seu imc é %.2f", imc);
            System.out.println(" Você está acima do peso, com obesidade de grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.printf("Seu imc é %.2f", imc);
            System.out.println(" Você está acima do peso, com obesidade de grau II (severa)");
        } else {
            System.out.printf("Seu imc é %.2f", imc);
            System.out.println(" Você está acima do peso, com obesidade de grau III (mórbida)");
        }

        sc.close();
    }
}
