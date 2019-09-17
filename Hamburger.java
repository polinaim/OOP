public class Hamburger extends Food {

    int howManyPatties = 1;
    boolean hasLettuce = true;
    boolean hasTomato = true;
    boolean hasOnion = true;

    public Hamburger(){
        name = "Generic Hamburger!";
        comment = "I'm a hamburger! Specifically of type " + name;
    }
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println();
        System.out.println("how many patties: "+ howManyPatties);
        System.out.println("Has lettuce: "+hasLettuce);
        System.out.println("has onions: "+ hasOnion);
        System.out.println("has tomato: "+hasTomato);
    }
}
