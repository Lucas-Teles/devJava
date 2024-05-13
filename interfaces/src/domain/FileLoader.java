package domain;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo . . .");
    }

    public void remove(){
        System.out.println("removendo arquivo . . .");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão de arquivos");
    }
}
