package test;

import domain.DataBaseLoader;
import domain.DataLoader;
import domain.FileLoader;

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
