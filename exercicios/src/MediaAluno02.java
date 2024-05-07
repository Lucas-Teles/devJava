import java.util.Locale;
import java.util.Scanner;

public class MediaAluno02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.print("Insira o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Insira a primeira nota do aluno: ");
        nota1 = sc.nextDouble();
        System.out.print("Insira a segunda nota do aluno: ");
        nota2 = sc.nextDouble();
        System.out.print("Insira a tereceira nota do aluno: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3)/3;
        System.out.println("Aluno: " + nome);
        System.out.printf("A media final é %.2f", media);

        if (media >= 7){
            System.out.println(" aluno foi aprovado");
        } else {
            System.out.println(" aluno foi reprovado");
        }


        sc.close();
    }
}
