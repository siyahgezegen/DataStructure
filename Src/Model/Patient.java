package Src.Model;

public class Patient {
    public int content;
    public Patient next;

    public Patient(int content) {
        this.content = content;
        next = null;
    }
}
