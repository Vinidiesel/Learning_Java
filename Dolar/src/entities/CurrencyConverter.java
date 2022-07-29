package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarTotal(double dollarPrice, double mount){
        return dollarPrice*mount+(dollarPrice*mount*IOF);
    }

}
