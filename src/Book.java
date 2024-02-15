import java.util.Scanner;

/**
 * Book class that represents a book in the bookstore
 */

public class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price){

        this.title = title;
        this.author = author;
        this.price = price;

    }
    public String getTitle(){

        return title;
    }

    public String getAuthor(){
        return author;
    }
    public double getPrice(){
       return price;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Book book = new Book("black Clover", "Yuki Tabata", 20.49);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());


    }

}
