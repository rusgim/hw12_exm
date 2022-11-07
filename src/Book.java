public class Book {
    private String nameBook;

    private Author author;
    int year;

    public Book(String nameBook, Author Author, int year) {;
        this.nameBook = nameBook;
        this.author = Author;
        this.year = year;
    }

    public String getNameBook() {
        return  this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
