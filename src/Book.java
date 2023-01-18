public class Book extends Products {
    private String author;
    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String auther) {
        this.author = auther;
    }

    @Override
    public double getDiscount() {
        double Discount=getPrice()*0.1;
        return getPrice()-Discount;

    }
}
