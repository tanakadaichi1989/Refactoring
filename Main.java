public class Main {
    public static void main(String[] args){
        System.out.println("This code is sample for Refactoring.");

        Customer customer = new Customer("Customer1");
        Movie movie1 = new Movie("Movie1", 0);
        Rental rental1 = new Rental(movie1, 14);

        Movie movie2 = new Movie("Movie2", 1);
        Rental rental2 = new Rental(movie2, 30);

        customer.addRental(rental1);
        customer.addRental(rental2);
        System.out.println(customer.statement());
    }
}
