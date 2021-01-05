package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        //What data types should the dimensions be?
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();

    }

    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the rectangle?");
        Double rectangleLength = scanner.nextDouble();

        System.out.print("What is the width of the rectangle?");
        Double rectangleWidth = scanner.nextDouble();

        Double area = rectangleLength * rectangleWidth;

        System.out.println("Area = " + area.toString());
    }

}
