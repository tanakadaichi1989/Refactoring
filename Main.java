public class Main {
    public static void main(String[] args){
        System.out.println("This code is sample for Refactoring.");

        Customer customer = new Customer("Customer1");
        Movie movie1 = new Movie("Movie1", 0);
        Rental rental1 = new Rental(movie1, 14);

        customer.addRental(rental1);
        System.out.println(customer.statement());
    }
}
