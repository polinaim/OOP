public class Food {
    String name = "Generic food class";
    boolean tasty = true;
    int levelOfHealthyness = 2;
    boolean veganFriendly = false;
    String comment = "I'm a generic food. You are not supposed to use me directly.";

    public void PrintDetails(){
        System.out.println("Here are the details of your food:");
        System.out.println("name: "+name);
        System.out.println("tasty: "+tasty);
        System.out.println("level of healthiness: "+levelOfHealthyness);
        System.out.println("vegan friendly: "+veganFriendly);
        System.out.println("Comment: "+comment);
    }
}
