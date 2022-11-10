public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author(String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
    }

    public String toString() {
        return "Автор " + this.nameAuthor + " " + this.surNameAuthor;
    }
}
