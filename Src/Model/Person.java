package Src.Model;

/**
 * Person
 */
public class Person {

    public int content;

    public Person prev;
    public Person next;

    public Person(int content) {
        this.content = content;
        next = null;
        prev = null;
    }

}