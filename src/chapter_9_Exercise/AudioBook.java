package chapter_9_Exercise;

public class AudioBook extends Book{

    private int bookSize;
    private int length;
    private String artistName;

    public AudioBook(String title, int yearOfPublication, String author, int bookSize, int length, String name) {
        super(title, yearOfPublication, author);
        this.bookSize = bookSize;
        this.length = length;
        this.artistName = name;
    }

    public int getBookSize() {
        return bookSize;
    }

    public void setBookSize(int bookSize) {
        this.bookSize = bookSize;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return String.format("%s: %d%n%s: %d%n%s: %s%n%s",
                "Book-size",bookSize,"Play-length",length,"Artist-Name",artistName,super.toString());
    }

}
