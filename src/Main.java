public class Main {
    public static void main(String[] args) {
        AList <String> booksList = new AList<>();
        //booksList.listAdd("Book1");
        //booksList.listAdd("book1");
        //booksList.listAdd("book2");
        //booksList.listAdd("book1");


        booksList.listAdd("{bookName:wireless networks, author:Anke Berr, price:14.99}");
        booksList.listAdd("{bookName:wireless networks, author:Anke Berr, price:14.99}");
        booksList.listAdd("{bookName:crème waffles for dummies, author:Piro Lane, price:24.79}");
        booksList.listAdd("{bookName:wireless networks, author:Anke Berr, price:14.99}");


        System.out.println("Before:");
        System.out.println(booksList.toString());

        booksList.listRemove(1); // removes element at index 1

        System.out.println("After:");
        System.out.println(booksList.toString());
    }
}