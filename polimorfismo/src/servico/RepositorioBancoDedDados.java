package servico;

import repositorio.Repositorio;

public class RepositorioBancoDedDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
