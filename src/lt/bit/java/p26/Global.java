package lt.bit.java.p26;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Global {

    public static List<Note> notes = Arrays.asList(
            new Note(LocalDateTime.now(), "Title 1", "Content 1"),
            new Note(LocalDateTime.of(2021, 2, 25, 23, 59, 59),
                    "Title 2", "Content 2")
    );
}
