package chapter_9_Exercise;

public class Book {

    private String title;
    private int yearOfPublication;
    private String author;

    public Book(String title, int yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %d%n%s: %s",
                "Title",title,"Year of Publication",yearOfPublication,"Author",author);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
