package basics;

public class Price {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);
        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);
    }
}
