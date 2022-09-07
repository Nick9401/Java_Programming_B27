package day39OOP_Inharitance.Bank.Book;

public class BooksObjects {
    public static void main(String[] args) {

        Ebook book1 = new Ebook();

        book1.title = "Hamlet";
        book1.author = "Shakespeare";
        book1.price = 20;

        book1.size= "1.5GB";
        System.out.println(book1);
        System.out.println("Size:" +book1.size);

        book1.pages=432;
        System.out.println("Number of pages"+book1.pages);

        book1.readbook();
        System.out.println("==========================");

        AudioBook book2 = new AudioBook();
        book2.title = "Becoming";
        book2.author = "Michaele Obama";
        book2.price=30;
        book2.length = "19 hours and 3 minutes";

        System.out.println(book2);
        System.out.println("Length of the audioBook:"+book2.title +book2.length);
        book2.listen();
    }

}
