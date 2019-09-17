import java.util.Scanner;

public class Foods {
    public static void main(String[] args){
        System.out.println("Hello, welcome to our restaurant!");
        System.out.println("Please choose the food that interests you:");
        System.out.println("From our Pizzas:");
        System.out.println("1. Hawaiian");
        System.out.println("2. Olives");
        System.out.println("3. Meat\n");
        System.out.println("From our Hamburgers:");
        System.out.println("4. Double");
        System.out.println("5. Cheese Burger\n");

        System.out.println("What food would you like?");
        Scanner myObj = new Scanner(System.in);
        int input;
        input = myObj.nextInt();
        switch (input){
            case 1:
                Hawaiian Hawaiian = new Hawaiian();
                Hawaiian.PrintDetails();
                break;
            case 2:
                Olives olives = new Olives();
                olives.PrintDetails();
                break;
            case 3:
                Meat meat=new Meat();
                meat.PrintDetails();
                break;
            case 4:
                Double Double = new Double();
                Double.PrintDetails();
                break;
            case 5:
                CheeseBurger CB = new CheeseBurger();
                CB.PrintDetails();
                break;
        }
    }
}
