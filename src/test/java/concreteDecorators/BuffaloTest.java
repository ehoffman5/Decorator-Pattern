package concreteDecorators;

import component.Wings;
import concreteComponent.PlainWings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuffaloTest {
    @Test
    public void testGetName() {

        Wings buffaloWings = new Buffalo(new PlainWings());

        String name = buffaloWings.getName();

        assertEquals("Buffalo Wings", name);

    }

    @Test
    public void testGetDescription() {

        Wings buffaloWings = new Buffalo(new PlainWings());

        String description = buffaloWings.getDescription();

        assertEquals("Tasty vegan seitan wings with spicy buffalo sauce.", description);

    }

    @Test
    public void testGetCost() {

        Wings buffaloWings = new Buffalo(new PlainWings());

        double cost = buffaloWings.getCost();

        assertEquals(5.50, cost, 0);

    }
}
