package chapter_9_Exercise;

public class PrintBook extends Book{

    private String publisher;
    private String isbn;

    public PrintBook(String title, int yearOfPublication, String author, String publisher, String isbn) {
        super(title, yearOfPublication, author);
        this.publisher = publisher;
        this.isbn = isbn;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s",
                "Publisher",publisher,"ISBN",isbn,super.toString());
    }



}
