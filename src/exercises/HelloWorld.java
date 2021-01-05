package exercises;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.askForUserName();
    }

    public void askForUserName() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name:");

        String name = input.nextLine();

        System.out.println("Hello " + name);
    }

}
