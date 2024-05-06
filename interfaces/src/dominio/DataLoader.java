package dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Checando permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }


}
