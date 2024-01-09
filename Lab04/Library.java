/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab04;

/**
 *
 * @author pc
 */
public class Library {

    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;

    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        } else if (slot == 2) {
            book2 = book;
        } else if (slot == 3) {
            book3 = book;
        }
    }
//    public void addBook(Book book, int slot) {
//        if (slot == 1) {
//            book1 = book;
//        } else if (slot == 2) {
//            book2 = book;
//        } else if (slot == 3) {
//            book3 = book;
//        }
//    }

    public void removeBook(int slot) {
        if (slot == 1) {
            book1 = null;
        } else if (slot == 2) {
            book2 = null;
        } else if (slot == 3) {
            book3 = null;
        }
    }

    public void printLibraryDetails() {
        System.out.println("Library: "+libraryName);
        System.out.println();
        printBookDetails(book1);
        System.out.println();
        printBookDetails(book2);
        System.out.println();
        printBookDetails(book3);
    }

    public void checkBookAvailability(int slot) {
        if (slot == 1 && book1 != null){
            System.out.println(book1.title + " is available.");
        }
        else if (slot ==2 && book2 != null){
            System.out.println(book2.title + " is available.");
        }
        else if (slot ==3 && book3!=null){
            System.out.println(book3.title + " is available.");
        }
        else{
            System.out.println("Book in slot " + slot + " is not available.");
        }
    }

    public void updateBookPrice(int slot, double newPrice) {
        if (slot == 1&&book1!=null){
            book1.price = newPrice;
            System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
        }
        else if (slot ==2 &&book2!=null){
            book2.price = newPrice;
            System.out.println("Updated price of " + book2.title + " to $" + newPrice + ".");
        }
        else if (slot ==3 &&book3!=null){
            book3.price = newPrice;
            System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
        }
        else{
            System.out.println("No book in this slot.");
        }
    }

    public void printBookDetails(Book book) {
        if (book == book1 & book1 != null) {
            System.out.println("Title: " + book1.title);
            System.out.println("Author: " + book1.author);
            System.out.println("Publisher: " + book1.publisher);
            System.out.println("Year Published: " + book1.yearPublished);
            System.out.println("Price: $" + book1.price);
            if (book1.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }
        } else if (book == book2 & book2 != null) {
            System.out.println("Title: " + book2.title);
            System.out.println("Author: " + book2.author);
            System.out.println("Publisher: " + book2.publisher);
            System.out.println("Year Published: " + book2.yearPublished);
            System.out.println("Price: $" + book2.price);
            if (book2.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }
        } else if (book == book3& book3 != null) {
            System.out.println("Title: " + book3.title);
            System.out.println("Author: " + book3.author);
            System.out.println("Publisher: " + book3.publisher);
            System.out.println("Year Published: " + book3.yearPublished);
            System.out.println("Price: $" + book3.price);
            if (book3.isAvailable == true) {
                System.out.println("Available: Yes");
            } else {
                System.out.println("Available: No");
            }
        } else if (book == null) {
            System.out.println("No book in this slot.");
        }
    }
}
