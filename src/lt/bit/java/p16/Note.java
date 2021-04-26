package lt.bit.java.p16;

import java.time.LocalDateTime;

public class Note {

    private LocalDateTime date;
    private String title;
    private String content;

    public Note(LocalDateTime date, String title, String content) {
        this.date = date;
        this.title = title;
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
