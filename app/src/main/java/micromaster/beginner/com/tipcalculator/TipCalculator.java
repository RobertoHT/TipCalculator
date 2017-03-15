package micromaster.beginner.com.tipcalculator;

/**
 * Created by praxis on 15/03/17.
 */

public class TipCalculator {
    public String calculateTip(double billAmount, double tipToCalculate) {
        billAmount += billAmount * tipToCalculate;
        return Double.toString(billAmount);
    }

    public static Double parseBillValue(String tipValue) {
        try {
            return Double.parseDouble(tipValue);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
