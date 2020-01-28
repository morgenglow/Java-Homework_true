package lesson5.classwork;

public class Triangle {
    //
    private double a, b, c;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        c = Math.sqrt(a * a + b * b);
    }
    //alt + insert

    public boolean checkInPoint(double x, double y) {
        // TODO: 28.01.2020
        return false;
    }
    
    public void setA(double length) {
        this.a = length;
        c = Math.sqrt(a * a + b * b);
    }

    public void setB(double length) {
        this.b = length;
        c = Math.sqrt(a * a + b * b);
    }

    public double angleAC() {
        return Math.asin(b / c) * 180 / Math.PI;
    }

    public double angleBC() {
        return Math.acos(b / c) * 180 / Math.PI;
    }

    public double angleAB() {
        return 180 - angleAC() - angleBC();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void printInfo() {
        System.out.printf("a = %.2f, b = %.2f, c = %.2f\n", a, b, c);
    }

//
}
