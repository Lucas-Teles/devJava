package teste;

import domain.Computador;
import domain.Televisao;
import domain.Tomate;
import repositorio.Repositorio;
import servico.CalculadoraImposto;
import servico.RepositorioMemoria;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("DEll-Ryzen7", 8700);
        Tomate tomate = new Tomate("Tomate", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------- -------- --------- ------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------- -------- --------- ------");
        CalculadoraImposto.calcularImposto(televisao);
        System.out.println("-------------------------");

        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
