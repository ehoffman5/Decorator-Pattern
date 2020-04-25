package concreteDecorators;

import component.Wings;
import concreteComponent.PlainWings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbecueTest {
    @Test
    public void testGetName() {

        Wings barbecueWings = new Barbecue(new PlainWings());

        String name = barbecueWings.getName();

        assertEquals("Barbecue Wings", name);

    }

    @Test
    public void testGetDescription() {

        Wings barbecueWings = new Barbecue(new PlainWings());

        String description = barbecueWings.getDescription();

        assertEquals("Tasty vegan seitan wings with smoky barbecue sauce.", description);

    }

    @Test
    public void testGetCost() {

        Wings barbecueWings = new Barbecue(new PlainWings());

        double cost = barbecueWings.getCost();

        assertEquals(5.50, cost, 0);

    }
}
