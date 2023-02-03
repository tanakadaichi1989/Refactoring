public abstract class Price {
    abstract int getPriceCode();

    double getAmount(int daysRented){
        double result = 0.0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                    break;
                }
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }
}

class ChildrensPrice extends Price {

    @Override
    int getPriceCode() {
        // TODO Auto-generated method stub
        return Movie.CHILDRENS;
    }

}

class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        // TODO Auto-generated method stub
        return Movie.NEW_RELEASE;
    }
    
}

class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        // TODO Auto-generated method stub
        return Movie.REGULAR;
    }

}