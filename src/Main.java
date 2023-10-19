package VeriYapilari;

import VeriYapilari.LinkedList.LinkedList;
import VeriYapilari.Model.Student;

public class Main {
    public static void main(String[] args) {
        int sayi = 2;
        LinkedList d1 = new LinkedList();
        d1.AddElementInHead(new Student(5));
        d1.AddElementInHead(new Student(12));

        d1.AddElementInTail(new Student(25));
        d1.AddElementInTail(new Student(27));
        d1.AddElementInTail(new Student(29));
        d1.AddElementInTail(new Student(32));
        d1.AddElementInTail(new Student(35));
        
        d1.GetList();
        
        System.out.println("______________________");
        
        d1.DeleteElement(new Student(27));
        
        d1.GetList();
        System.out.println("______________________");
        d1.DeleteElementInHead();
        d1.GetList();
    }

}
