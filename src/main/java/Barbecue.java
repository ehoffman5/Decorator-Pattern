public class Barbecue extends SauceDecorator {

    public Barbecue(Wings newWings) {
        super(newWings);
    }

    // Returns getName() of PlainWings and concatenates the sauce name at the beginning
    public String getName() {
        return "Barbecue " + tempWings.getName();
    }

    // Returns getDescription() of PlainWings and concatenates the sauce at the end
    public String getDescription() {
        return tempWings.getDescription() + " with smoky barbecue sauce.";
    }

    // Returns total cost of order
    public double getCost() {
        System.out.println("Sauce Price: $" + 0.50);
        return tempWings.getCost() + 0.50;
    }

}