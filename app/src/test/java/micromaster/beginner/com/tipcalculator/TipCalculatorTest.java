package micromaster.beginner.com.tipcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by praxis on 15/03/17.
 */
public class TipCalculatorTest {
    private TipCalculator tipCalculator;
    @Before
    public void setUp() throws Exception {
        tipCalculator = new TipCalculator();
    }
    @Test
    public void calculateTip_15() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.15;
        String totalExpected = "115.0";
        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);
        //expected: 100 + (100*15%) = 115.0
        assertEquals(totalExpected, totalAmount);
    }

    @Test
    public void calculateTip_20() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.20;
        String totalExpected = "120.0";
        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);
        assertEquals(totalExpected, totalAmount);
    }

    @Test
    public void calculateTip_30() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.30;
        String totalExpected = "130.0";
        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);
        assertEquals(totalExpected, totalAmount);
    }

    @Test
    public void calculateTip_40() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.40;
        String totalExpected = "140.0";
        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);
        assertEquals(totalExpected, totalAmount);
    }

    @Test
    public void parseBillValue() throws Exception{
        Double billExpected = 100.0;
        String billValue = "100.0";

        Double result = tipCalculator.parseBillValue(billValue);

        assertEquals(billExpected, result);
    }

    @Test
    public void parseBillNull() throws Exception{
        Double billExpected = 100.0;
        String billValue = "abc";

        Double result = tipCalculator.parseBillValue(billValue);

        assertNull(result);
    }
}