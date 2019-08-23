public class MarketGood {

    public final String name;
    public final int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate) {
        if(discountRate < (100 * 0) || discountRate > (100 * 1)) {
            discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }

        this.name = name;
        this.retailPrice = retailPrice;


    }

    public MarketGood(String name, int retailPrice) {
        /*
        discountRate = 0;
        this.name = name;
        this.retailPrice = retailPrice;
        */
        this(name, retailPrice, 0);

    }





    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getDiscountedPrice(){
        return (int)((100 - discountRate) / 100.0 * retailPrice);
//        return (int)((100 - discountRate) * 0.01 * retailPrice);
    }

}