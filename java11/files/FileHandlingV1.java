package java11.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingV1 {
    public static void main(String[] args) throws IOException {
        var file = new File("hello.txt");
        System.out.println("File exists: " + file.exists());

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            var text = bufferedReader.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Other: " + e.getMessage());
        } finally {
            assert fileReader != null;
            fileReader.close();
            assert bufferedReader != null;
            bufferedReader.close();
        }
    }
}
