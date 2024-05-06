package test;

import dominio.DataBaseLoader;
import dominio.DataLoader;
import dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        dataBaseLoader.remove();
        fileLoader.remove();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
