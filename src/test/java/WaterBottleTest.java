import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void max_volume_of_bottle() {
        assertEquals(100, bottle.bottleVolume());
    }

    @Test
    public void add_drink_to_water_bottle_diminishes_volume() {
        bottle.drinkFromBottle();
        bottle.drinkFromBottle();
        assertEquals(80, bottle.bottleVolume());
    }

    @Test
    public void empty_water_bottle() {
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void fill_water_bottle() {
//        bottle.drinkFromBottle();
//        bottle.fillBottle();
        // actual: bottle.bottleVolume
        assertEquals(100, bottle.fillBottle());
    }

}
