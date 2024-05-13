package domain;

public class DataBaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    public void remove(){
        System.out.println("Removendo dados ... ");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na dataBase");
    }
}
