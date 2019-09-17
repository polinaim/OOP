public class Pizza extends Food {
    int CheeseAmount = 1;
    boolean HasOlives=false;
    int crustThickness = 2;

    public Pizza(){
        comment = "I'm a pizza! Specifically of type: " + name;
    }
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println();
        System.out.println("Cheese amount: "+ CheeseAmount);
        System.out.println("Has olives: "+HasOlives);
        System.out.println("Crust thicknesss: "+crustThickness);

    }
}
