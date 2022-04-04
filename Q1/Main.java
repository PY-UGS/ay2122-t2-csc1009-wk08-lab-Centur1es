package T8.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircleWithException circle = new CircleWithException();
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning){
            System.out.println("Enter circle radius: ");
            double radius = sc.nextDouble();
            circle.setRadius(radius);
            try {
                double area = circle.getArea(radius);
            } catch (Exception e) {
                e.printStackTrace();
                isRunning = false;
            }
        }

    }
}
