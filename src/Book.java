public class Book {
    private String nameBook;

    private Author Author;
    int year;

    public Book(String nameBook, Author Author, int year) {;
        this.nameBook = nameBook;
        this.Author = Author;
        this.year = year;
    }

    public String getNameBook() {
        return  this.nameBook;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
