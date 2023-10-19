package VeriYapilari.Model;

public class Student {
    public int content;
    public Student next;

    public Student(int content) {
        this.content = content;
        next = null;
    }
}
