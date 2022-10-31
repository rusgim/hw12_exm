public class Book {
    private String nameBook;
    private String Author;
    int year;

    public Book(String nameBook, String Author, int year) {
        this.Author = Author;
        this.nameBook = nameBook;
        this.year = year;
    }

    public String getNameBook() {
        return  this.nameBook;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
