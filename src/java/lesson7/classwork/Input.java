package lesson7.classwork;

import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Mikhail\\IdeaProjects\\java1\\src\\java\\lesson7\\res\\out.txt";
        File f = new File(path);
        OutputStream fout = new FileOutputStream(f, true);
//        fout.write(49);
//        fout.write(49);
//        fout.write(49);
//        fout.close();
        try(PrintWriter pr = new PrintWriter(fout)) {
            pr.println("My text 2");
        }
        InputStream in = System.in;
        OutputStream out = System.out;

//        int x, val = 0;
//        //new Scanner(in).nextInt();
//        while ((x = in.read()) != -1) {
//            out.write(x);
//            if (x == 10) break;
//            if (x <= '0' || x >= '9') {
//                System.err.println("Number format exception");
//                return;
//            }
//            val = (val * 10) + x - '0';
//        }
//        System.out.println(val);
    }
}
