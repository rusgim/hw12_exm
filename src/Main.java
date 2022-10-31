public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("The Bridge", "Stiven King", 2021);
        System.out.println("book1.Author = " + book1.getAuthor());
        System.out.println("book1.year = " + book1.getYear());
        System.out.println("book1.nameBook = " + book1.getNameBook());

        Book book2 = new Book("The Green Mile", "Stiven King",1999);
        System.out.println("book2.Author = " + book2.getAuthor());
        System.out.println("book2.year = " + book2.getYear());
        System.out.println("book2.nameBook = " + book2.getNameBook());
    }
}