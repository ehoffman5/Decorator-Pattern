package concreteComponent;// Every Pizza made will start as a PlainPizza

import component.Wings;

public class PlainWings implements Wings {

    public String getName() {
        return "component.Wings";
    }

    public String getDescription() {
        return "Tasty vegan seitan wings";
    }

    public double getCost() {
        System.out.println("Wing Price: $" + 5.00);
        return 5.00;
    }

}