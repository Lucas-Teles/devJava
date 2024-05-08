import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquidoProfessor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double horaAula;
        int quantAulas;
        double inss;
        double salarioLiquido;

        System.out.println("Bem vindo ao liquidsalary");
        System.out.print("Digite o valor da sua hora aula: ");
        horaAula = sc.nextDouble();
        System.out.print("Digite quantas aulas você deu esse mês: ");
        quantAulas = sc.nextInt();
        System.out.print("Qual porcentagem de desconto? digite somente os numeros: ");
        inss = sc.nextDouble()/100;

        salarioLiquido = (horaAula * quantAulas)-(horaAula * quantAulas * inss);

        System.out.println(salarioLiquido);







    }
}
