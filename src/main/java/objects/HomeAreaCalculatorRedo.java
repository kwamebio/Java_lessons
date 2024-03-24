package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();

        double totalArea = calculator.calculateAreaOfRoom(room1, room2);
        System.out.println(totalArea);

    }

    public Rectangle getRoom(){
        System.out.println("Enter length");
        double length = scanner.nextDouble();
        System.out.println("Enter width");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
