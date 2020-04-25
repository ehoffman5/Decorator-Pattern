// Each wing order 'has a' sauce

abstract class SauceDecorator implements Wings {

    protected Wings tempWings;

    // Sauces (Decorators) dynamically customize the PlainWings
    public SauceDecorator(Wings newWings){
        tempWings = newWings;
    }

    public String getDescription() {
        return tempWings.getDescription();
    }

    public double getCost() {
        return tempWings.getCost();
    }

}