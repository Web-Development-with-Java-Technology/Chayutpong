import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        System.out.println("----- Menu -----");
        System.out.println("1 : Spaghetti");
        System.out.println("2 : Green curry");
        System.out.println("3 : Hamburger");
        System.out.println("4 : Pizza");
        System.out.println("5 : Sushi");
        System.out.println("----------------");
        Scanner menu = new Scanner(System.in);
        System.out.print("Select your food : ");
        int order = menu.nextInt();
        menu.close();
        switch (order) {
            case 1 -> System.out.print("You select : Spaghetti");
            case 2 -> System.out.print("You select : Green curry");
            case 3 -> System.out.print("You select : Hamburger");
            case 4 -> System.out.print("You select : Pizza");
            case 5 -> System.out.print("You select : Sushi");
            default -> System.out.print("Not on the Menu");
        }
    }
}
