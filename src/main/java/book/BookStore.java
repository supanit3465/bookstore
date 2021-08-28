package book;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        Customer customer = new Customer();

        BookStore bookStroe = new BookStore();
        bookStroe.buy(customer);
    }

    private void buy(Customer customer) {
        Book book1 = new Book();
        Book book2 = new Book();
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        //Add book to basket
        Basket basket = new Basket();
        basket.addBooks(books);

        //calculate
        Discount discount = new Discount();
        int maxDiscountPrice = discount.calculate();
    }
}
