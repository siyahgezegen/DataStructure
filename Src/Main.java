package VeriYapilari.DataStructure.Src;

import VeriYapilari.DataStructure.Src.LinkedList.LinkedList;
import VeriYapilari.DataStructure.Src.Model.Student;;

public class Main {
    public static void main(String[] args) {
        // Örnek LinkList Kullanımı
        LinkedList examLinkedList = new LinkedList();
        examLinkedList.AddElementInHead(new Student(25));
        int a = examLinkedList.GetElementInList(0);
        System.out.println(a);
    }

}
