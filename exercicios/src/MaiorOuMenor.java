import java.util.Scanner;

public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        String maiorIdade = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(maiorIdade);

        sc.close();
    }
}
