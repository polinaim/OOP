public class CheeseBurger extends Hamburger {
    boolean hasCheese = true;

    public CheeseBurger(){
        name="Cheese Burger";
        hasLettuce=false;
        hasTomato=false;
    }
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("has cheese: "+ hasCheese);
    }
}
