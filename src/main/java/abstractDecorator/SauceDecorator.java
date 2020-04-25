package abstractDecorator;

import component.Wings;

// Each wing order 'has a' sauce
public abstract class SauceDecorator implements Wings {

    protected Wings tempWings;

    // Sauces (Decorators) dynamically customize the concreteComponent.PlainWings
    public SauceDecorator(Wings newWings){
        tempWings = newWings;
    }

    public String getName() {
        return tempWings.getName();
    }

    public String getDescription() {
        return tempWings.getDescription();
    }

    public double getCost() {
        return tempWings.getCost();
    }

}