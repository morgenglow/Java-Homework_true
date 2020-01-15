public class Homework1 {
    //Task 3: метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static float summFloat (float a, float b, float c, float d) {
        return a*(b+c/d);
    }

    //Task 4: метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    //в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean checkSumm (int i, int j) {
        boolean g= true;
        if (10<=(i+j)&&(i+j)<=20) {
            return g;
        }
        else {
            return g = false;
        }

    }

    //Task 5: метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль, положительное ли число передали или отрицательное.
    public static void checkInt (int i) {
        if (i>=0) {
            System.out.println("Число положительное!");
        }
        else {
            System.out.println ("Число отрицательное");
        }
    }

    //Task 6: метод, которому в качестве параметра передается целое число. 
    //Метод должен вернуть true, если число отрицательное.
    public static boolean revCheck (int i) {
        boolean g = true;
        if (i >= 0) {
            return g;
        }
        return !g;
    }

    //Task 7: метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greetings (String name) {
        System.out.println("Привет, " +name + "!");
    }

    //    Task 8: Метод, который определяет, является ли год високосным, и выводит сообщение в
//    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
//    високосный.
    public static void bissextile (int y) {
        int check = (y%4);
        int ann = y%100, ann2 = y%400;
        if ((check == 0 && ann!=0)||ann2==0) {
            System.out.println("Год високосный!");
        }
        else {
            System.out.println ("Год не високосный!");
        }
    }

    public static void main(String[] args) {
        //Task 1: Создать переменные всех пройденных типов данных, и инициализировать их значения
        int i = 5, j = 40, y = 2019;
        byte s = 100;
        long n = 20000L;
        float a  = 12.23f, b = 15.45f, c = 17.87f, d = 15.35f;
        double e = 124.124;
        char f = 'N';
        boolean g = true;
        short k = 3200;
        String name = "Kesha";

        summFloat(a,b,c,d);
        checkSumm(i, j);
        checkInt(i);
        revCheck(i);
        greetings(name);
        bissextile(y);
    }
}

