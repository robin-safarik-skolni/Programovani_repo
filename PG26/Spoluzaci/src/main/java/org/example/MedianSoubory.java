package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MedianSoubory {
    public static void main(String[] args) throws IOException {
        Path cesta = Paths.get("Z:\\2026\\Programovani_repo\\PG26\\Spoluzaci\\src\\main\\java\\org\\example\\seznam.txt");
        BufferedReader reader = Files.newBufferedReader(cesta);
        String radek = reader.readLine();

        int i =1;
        for(; (radek = reader.readLine()) != null; i++){
            if (i <= 10)
                System.out.println(i+". "+radek);
        }

        reader.close();
    }
}
