package pl.lublin.wsei.java.cwiczenia.lab5.console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNioCopy {
    public static void main(String[] args) throws IOException{
        // long startTime = System.currentTimeMilis();
        long startTime = System.nanoTime();
        Path oryginial = Paths.get("sample_1920x1280.tiff");
        Path kopia = Paths.get("img_copy2.tiff");
        Files.copy(oryginial, kopia, StandardCopyOption.REPLACE_EXISTING);
        // System.out.println("Czas     kopiowania: " + (System.currentTimeMilis() - startTime) +" ms");
        System.out.println("Czas kopiowania: "+ (float)(System.nanoTime() - startTime)/1000000+" ms");
    }
}
