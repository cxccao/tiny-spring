package cxc.tinyioc;

/**
 * Created by cxc Cotter on 2020/6/27.
 */
public class Book {
    String name;
    String price;

    public Book() {

    }

    public Book(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void bookInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
