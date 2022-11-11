package hotel;

public class PriceCalculator {
    public static double calculateHolidayPrice(double pricePerDay,int days,Season season,DiscountType discountType){
        double fullPrice=pricePerDay*days;
        fullPrice=fullPrice*season.getMultiplyCoefficient();
        fullPrice=fullPrice-fullPrice*discountType.getPercent()/100;
        return fullPrice;
    }
}
