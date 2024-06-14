package GLAB_303_11_3;

import java.util.ArrayList;
import java.util.List;

public class AddData {
    public List<Book> addToList(){
        List<Book> books = new ArrayList<Book>();
        // Passing data using Constructors
        Book b1 = new  Book(1, "Death note", "John", "cartoon");
        Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
        Book b3 = new Book(3, "Spider man", "Alex", "Kids");
        Book b4 = new Book(4, "GentleMen", "Max", "Action");
        // Passing data using setter
        Book b5 = new Book();
        b5.setNumber(5);
        b5.setName("Java FullStack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");
        // Adding Books objects to Arraylist
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        return books;
    }

    public static void main(String[] args) {
        AddData list = new AddData();
        List<Book> books =list.addToList();
        for(Book book : books){
            System.out.println(book);
        }

    }

}
