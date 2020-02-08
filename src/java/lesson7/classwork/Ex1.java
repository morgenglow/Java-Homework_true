package lesson7.classwork;

public class Ex1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcde");
        s.setCharAt(2, 'L');
        s.delete(1, 3); // [left; right)
        s.insert(2, "MAMA");
        System.out.println();
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) { // 10 ** 6
//            s.append('a');//s = new String(copy of "aaaaaa")O(len) + new String("a")
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start + " ms.");
    }
}
