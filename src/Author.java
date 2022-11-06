public class Author {
    private Author nameAuthor;
    private Author surNameAuthor;

    public Author(Author nameAuthor, Author surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public Author getSurNameAuthor() {
        return surNameAuthor;
    }
}
