package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Area area = new Area();
        area.calculateAreaOfCircle();

    }

    public void calculateAreaOfCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the radius of the circle?");
        Double circleRadius = scanner.nextDouble();

        Double area = Math.PI * circleRadius * circleRadius;

        System.out.println("Area = " + area.toString());
    }

}