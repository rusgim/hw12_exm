public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("The Bridge", "Stiven, King", 2021);
        System.out.println("book1.year = " + book1.getYear());
        System.out.println("book1.nameBook = " + book1.getNameBook());

        Book book2 = new Book("The Green Mile","Stiven King", 1999);
        System.out.println("book2.year = " + book2.getYear());
        System.out.println("book2.nameBook = " + book2.getNameBook());

        book1.setYear(1980);
        book2.setYear(1965);
        System.out.println("book1.getYear() = " + book1.getYear());
        System.out.println("book2.getYear() = " + book2.getYear());
    }
}