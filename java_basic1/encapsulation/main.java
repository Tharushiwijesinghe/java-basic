
public class Main {
    public static void main(String[] args) {
        Book book = new Book();

       book.setBookName("Loweena");
       book.setPageNo(345);

        System.out.println("Book Name: " + book.getBookName());
        System.out.println("No of pages: " + book.getPageNo());
    }
}
