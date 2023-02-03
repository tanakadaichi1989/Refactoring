public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;
    private double amount;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public void setPriceCode(int priceCode) {
        switch(priceCode){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
        }
    }

    public int getPriceCode(){
        return _price.getPriceCode();
    }

    public String getTitle(){
        return _title;
    }

    public double getAmount(int daysRented){
        return _price.getAmount(daysRented);
    }
}