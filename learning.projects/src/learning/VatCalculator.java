package learning;

public class VatCalculator {

    public static void main(String[] args) {
        double priceNetto = 20.50;
        double vat = 0.9;

        double vatPart = priceNetto * vat;

        double priceBrutto = priceNetto + vatPart;

        String currencySymbol = "$";

        System.out.println("Netto: " + priceNetto + currencySymbol);
        System.out.println("Mwst. " + (int) (vat * 100) + "% : " + vatPart + currencySymbol);
        System.out.println("Brutto:" + priceBrutto + currencySymbol);
    }
}
