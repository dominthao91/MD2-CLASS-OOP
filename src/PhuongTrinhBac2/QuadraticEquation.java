package PhuongTrinhBac2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public void setA() {
        this.a = a;
    }

    public void setB() {
        this.b = b;
    }

    public void setC() {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }


}
