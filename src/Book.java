import java.util.Objects;

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

    public String toString() {
        return "Название книги " + this.nameBook + " " + this.author + ", год издания " + this.year;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book3 = (Book) other;
        return nameBook.equals(book3.nameBook);
    }
    public int hashCode() {
        return Objects.hash(nameBook, year);
    }
}
