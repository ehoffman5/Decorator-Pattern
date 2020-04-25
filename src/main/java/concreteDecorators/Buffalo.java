package concreteDecorators;

import abstractDecorator.SauceDecorator;
import component.Wings;

public class Buffalo extends SauceDecorator {

    public Buffalo(Wings newWings) {
        super(newWings);
    }

    // Returns getName() of concreteComponent.PlainWings and concatenates the sauce name at the beginning
    public String getName() {
        return "concreteDecorators.Buffalo " + tempWings.getName();
    }

    // Returns getDescription() of concreteComponent.PlainWings and concatenates the sauce at the end
    public String getDescription() {
        return tempWings.getDescription() + " with spicy buffalo sauce.";
    }

    // Returns total cost of order
    public double getCost() {
        System.out.println("Sauce Price: $" + 0.50);
        return tempWings.getCost() + 0.50;
    }

}