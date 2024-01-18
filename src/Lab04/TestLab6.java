/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab04;

/**
 *
 * @author pc
 */
public class TestLab6 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.price = 450;
        book1.publisher = "Head First";
        book1.yearPublished = 2006;
        book1.isAvailable = false;
        book1.author = "John Smith";
        Book book2 = new Book();
        book2.title = "Python Programming";
        book2.price = 225;
        book2.publisher = "KM";
        book2.yearPublished = 2020;
        book2.isAvailable = true;
        book2.author = "Elon Potter";
        Library lib = new Library();
        lib.libraryName = "IT Library";
        lib.addBook(book2, 1);
        lib.addBook(book1, 3);
        lib.updateBookPrice(2, 1000);
        lib.updateBookPrice(3, 320);
        lib.printLibraryDetails();
        
    }
}

//public class TestLab6 {
//    public static void main(String[] args) {
//        Book book1 = new Book();
//        book1.title = "Java Programming";
//        book1.price = 450;
//        book1.publisher = "Head First";
//        book1.yearPublished = 2006;
//        book1.isAvailable = false;
//        book1.author = "John Smith";
//        book1.printDetails();
//        System.out.println("-------------");
//        book1.updatePrice(250);
//        book1.markAsAvailable();
//        book1.printDetails();
//        System.out.println(book1.isPublishedAfter(2000));
//    }
//}
