// Every Pizza made will start as a PlainPizza

public class PlainWings implements Wings {

    public String getDescription() {
        return "Tasty vegan seitan wings";
    }

    public double getCost() {
        System.out.println("Base Price: $" + 5.00);
        return 5.00;
    }

}