package book;

import java.util.List;

public class Basket {
    public Basket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private int customerId;
    private int BookInBasket;

    public void addBooks(List<Book> books) {
    }
}
