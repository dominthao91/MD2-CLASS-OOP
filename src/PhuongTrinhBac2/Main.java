package PhuongTrinhBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("giải phương trình bậc 2: ax^2 +bx+c =0");
        System.out.println("nhập số a");
        double a = scanner.nextDouble();
        System.out.println("nhập số b");
        double b = scanner.nextDouble();
        System.out.println("nhập số c");
        double c = scanner.nextDouble();
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("phương trình có 2 nghiệm : \n x1 = %2f \n x2 = %2f",
                    quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("phương trình có nghiệm kép x1 = x2 = " + quadraticEquation.getRoot1());
        }else {
            System.out.println("phương trinhg vô nghiệm");
        }

    }
}
