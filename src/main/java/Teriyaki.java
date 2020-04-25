public class Teriyaki extends SauceDecorator {

    public Teriyaki(Wings newWings) {
        super(newWings);
        System.out.println("Adding teriyaki sauce to order.");
    }

    // Returns getDescription() of PlainWings and concatenates the sauce at the end
    public String getDescription() {
        return tempWings.getDescription() + " with tangy teriyaki sauce.";
    }

    // Returns total cost of order
    public double getCost() {
        System.out.println("Sauce: $" + 0.50);
        return tempWings.getCost() + 0.50;
    }

}