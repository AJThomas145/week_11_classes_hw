import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp(){ waterBottle = new WaterBottle();}

    @Test
    public void drinkFromWaterBottle(){
        waterBottle.drinkFromBottle();
        waterBottle.drinkFromBottle();
        assertEquals(80, waterBottle.volume);
    }

    @Test
    public void emptyTheContentsOfWaterBottle(){
        waterBottle.emptyTheContentsOfBottle();
        assertEquals(0, waterBottle.volume);
    }

    @Test
    public void fillUpWaterBottle(){
        waterBottle.fillUpBottle();
        assertEquals(100, waterBottle.volume);
    }
}

