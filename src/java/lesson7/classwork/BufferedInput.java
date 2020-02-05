package lesson7.classwork;

import java.io.*;
import java.util.Arrays;

public class BufferedInput {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Mikhail\\IdeaProjects\\java1\\src\\java\\lesson7\\res\\out.txt";
        OutputStream out = new FileOutputStream(new File(path));
        long start = System.currentTimeMillis();
        //klsdjlksdjgsdjglsjdlkgjsldjglsjdgl
        //buffer = klsdjlksdjgsdjglsjd
        //in.read() = buffer[pos++] if pos > length then
        //read(buffer) pos = 0;
        for (int i = 0; i < 300000 / 1000; i++) { // 10 ** 6
            byte [] buffer = new byte[1000];
            Arrays.fill(buffer, (byte) 49);
            out.write(buffer);
        }
        out.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms.");
    }
}
