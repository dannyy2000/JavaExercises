package MyDiary;

import java.time.LocalDateTime;

public class Entry {
    private String title;
    private int id;
    private String body;
    private LocalDateTime time;


    public Entry(String title, int id, String body) {
        this.title = title;
        this.id = id;
        this.body = body;
        this.time = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", body='" + body + '\'' +
                ", time=" + time +
                '}';
    }
}
