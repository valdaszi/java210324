package lt.bit.java.p16;

public class MainActivity {

    void action() {
        System.out.println("Total notes: " + Global.notes.size());
        System.out.println("Note 1 title: " + Global.notes.get(0).getTitle());
    }

}
