public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Customer1");

        Movie movie1 = new Movie("Movie1", 0);
        Movie movie2 = new Movie("Movie2", 1);
        Movie movie3 = new Movie("Movie3", 2);

        Rental rental1 = new Rental(movie1, 14);
        Rental rental2 = new Rental(movie2, 14);
        Rental rental3 = new Rental(movie3, 14);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        
        System.out.println(customer.statement());
    }
}
