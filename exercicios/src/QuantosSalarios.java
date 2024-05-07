import java.util.Locale;
import java.util.Scanner;

public class QuantosSalarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double SALARIO_MINIMO = 1412.00;
        double salarioUsuario;

        System.out.print("Insira seu salario: ex. 1789.66 => ");
        salarioUsuario = sc.nextDouble();
        double quantosSalarios = salarioUsuario/SALARIO_MINIMO;

        if (quantosSalarios == 1){
            System.out.println("Você recebe 1 salario minimo");
        } else if (quantosSalarios > 1){
            System.out.printf("Você recebe %.2f salarios minimos", quantosSalarios);
        } else {
            System.out.println("Você recebe menos que 1 salario minimo");
        }


        sc.close();
    }
}
