public class Main {

    public static void main(String[] args) {
        Author authorBook = new Author("Stiven", "King");
        Book book1 = new Book("The Bridge", authorBook, 2021);
        System.out.println("Первая книга год издания " + book1.getYear());
        System.out.println("Первая книга автор " + book1.getAuthor());
        System.out.println("Первая книга название " + book1.getNameBook());

        Book book2 = new Book("The Green Mile",authorBook, 1999);
        System.out.println("Вторая книга год издания " + book2.getYear());
        System.out.println("Вторая книга автор " + book2.getAuthor());
        System.out.println("Вторая книга название " + book2.getNameBook());

        Book book3 = new Book("The Bridge",authorBook, 2021);

        book1.setYear(1980);
        book2.setYear(1980);
        System.out.println("Изменили год издания Книги 1 - " + book1.getYear());
        System.out.println("Изменили год издания Книги 2 - " + book2.getYear());

        //применение методов toString
        System.out.println("");
        System.out.println(authorBook);
        System.out.println(book1);
        //применение метода equals
        System.out.println(book1.equals(book3));
        //применение метода hashCode

    }
}