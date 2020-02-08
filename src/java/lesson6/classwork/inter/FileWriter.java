package lesson6.classwork.inter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter implements Writer {

    private String pathToFile;
    private PrintWriter writer;
    private File file;

    public FileWriter(){
        pathToFile = null;
        file = new File("output.txt");
        if (!file.exists()) {
            try {
                boolean flag = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public FileWriter(String pathToFile) {
        this.pathToFile = pathToFile;
        file = new File(pathToFile);
        if (!file.exists()) {
            try {
                boolean flag = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void println(String message) {
        try {
            writer = new PrintWriter(file);
            writer.println(message);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
