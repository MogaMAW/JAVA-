public class Library {

    public static void main(String[] args) {
        Resource resource = new Resource("QA76.1", "Euclid's geometry");
        Resource resource2 = new Resource("QA73.3", "Origin of the species");
        Resource resource3 = new Journal("QA73.2", "ACM Transactions", "March 2007");

        resource.isBorrowed = true;
        resource2.isBorrowed = true;
        resource3.isBorrowed = false;

        System.out.println(resource.summary());
        System.out.println(resource3.summary());
        System.out.println(resource2.summary());

    }
    public static void countBorrowedBooks(Resource resources) {

    }
}
