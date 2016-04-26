package model;

import model.Model;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by wookie on 4/26/16.
 */
public class ModelTest {
    private static final double ACCURACY = 1e-10;

    @Test
    public void testCalculateMean() throws Exception {
        Model instance = new Model(1, 2, 3, 6);
        instance.calculateMean();
        double result = instance.getMean();
        double expResult = 3.;
        assertEquals("Mean value:", expResult, result, ACCURACY);
    }

    @Test
    public void testRound() {
        Model instance = new Model(1, 2, 3, 9);
        instance.calculateMean(); //mean = 3.75
        instance.round();
        int result = instance.getRounded();
        int expResult = 4;
        assertEquals("Rounded value: ", expResult, result);

    }

}