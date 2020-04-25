public class Teriyaki extends SauceDecorator {

    public Teriyaki(Wings newWings) {
        super(newWings);
    }

    // Returns getName() of PlainWings and concatenates the sauce name at the beginning
    public String getName() {
        return "Teriyaki " + tempWings.getName();
    }

    // Returns getDescription() of PlainWings and concatenates the sauce description at the end
    public String getDescription() {
        return tempWings.getDescription() + " with tangy teriyaki sauce.";
    }

    // Returns total cost of order
    public double getCost() {
        System.out.println("Sauce Price: $" + 0.50);
        return tempWings.getCost() + 0.50;
    }

}