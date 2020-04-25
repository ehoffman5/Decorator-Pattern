package concreteDecorators;

import concreteComponent.PlainWings;
import component.Wings;
import org.junit.Test;
import static org.junit.Assert.*;

public class TeriyakiTest {
    @Test
    public void testGetName() {

        Wings teriyakiWings = new Teriyaki(new PlainWings());

        String name = teriyakiWings.getName();

        assertEquals("Teriyaki Wings", name);

    }

    @Test
    public void testGetDescription() {

        Wings teriyakiWings = new Teriyaki(new PlainWings());

        String description = teriyakiWings.getDescription();

        assertEquals("Tasty vegan seitan wings with tangy teriyaki sauce.", description);

    }

    @Test
    public void testGetCost() {

        Wings teriyakiWings = new Teriyaki(new PlainWings());

        double cost = teriyakiWings.getCost();

        assertEquals(5.50, cost, 0);

    }
}
