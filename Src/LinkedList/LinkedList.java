package Src.LinkedList;

import Src.Model.Student;

public class LinkedList {
    public Student head;
    public Student tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * integer bir değer döndürür.
     *
     * -2 = liste bos
     * 
     * -1 = aranan indis listede yok
     * 
     * -1 ya da -2 den farklı bir değer dönerse o değer elemanın contentidir.
     * 
     * @param indis : Aranan Elemanın indis numarası.
     */

    public int GetElementInList(int indis) {
        if (head == null)
            return -2;
        else {
            int i = 0;
            Student since = head;
            while (since != null) {
                if (i == indis)
                    return since.content;
                i++;
                since = since.next;
            }
        }
        return -1;

    }

    /**
     * 
     * Liste içerisindeki tüm elemanları yazdırır.
     */

    public void GetList() {
        if (head == null)
            System.out.println("List Is Empty");
        else {
            int i = 0;
            Student since = head;
            while (since != null) {
                i++;
                System.out.println(i + ". Eleman : " + since.content);
                since = since.next;
            }
        }

    }

    /**
     * Listenin ilk(head) elemanına verilen değeri atar.
     * Eğer liste boşsa, newStudent nesnesini hem head(baş) hem de tail(son/kuyruk)
     * olarak ekler.
     * 
     * @param newStudent : Yeni Eklenecek Olan Student Nesnesi
     * 
     */
    public void AddElementInHead(Student newStudent) {
        if (head == null) {
            head = newStudent;
            tail = newStudent;
        } else {
            newStudent.next = head;
            head = newStudent;
        }
    }

    /**
     * Listenin son(tail) elemanına verilen değeri atar.
     * Eğer liste boşsa, newStudent nesnesini hem head(baş) hem de tail(son/kuyruk)
     * olarak ekler.
     * 
     * @param newStudent : Yeni Eklenecek Olan Student Nesnesi
     * 
     */
    public void AddElementInTail(Student newStudent) {
        if (head == null) {
            head = newStudent;
            tail = newStudent;
        } else {
            tail.next = newStudent;
            tail = newStudent;
        }
    }

    /**
     * Listenin Son elemanını(kuyruk/tail)'i siler
     */
    public void DeleteElementInTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (tail == head) {
            tail = null;
            head = null;
        } else {
            Student tmp = head;
            while (tmp != tail) {
                if (tmp.next == tail) {
                    tail = tmp;
                    tmp.next = null;
                    break;
                }
                tmp = tmp.next;
            }
        }

    }

    /**
     * Araya Eleman ekleme işlemi.
     * eğer eleman listenin sonundaysa AddElementInTail fonksiyonu çağrılıyor.
     * 
     * @param newStudent : Yeni Eklenecek olan Student Elemanı
     * @param oldStudent : Belirtilen elemanın referansına ekler.
     */
    public void AddElementInBetween(Student newStudent, Student oldStudent) {
        if (head == null) {
            System.out.println("List Is Empty");
        } else {
            Student tmp = head;
            while (tmp != null) {
                if (tmp.content == oldStudent.content) {
                    newStudent.next = tmp.next;
                    tmp.next = newStudent;
                    break;
                } else
                    System.out.println("Element is not found");
                tmp = tmp.next;
            }

        }
    }

    /**
     * Listenin Başındaki(Head/ilk) elemanını siler.
     */
    public void DeleteElementInHead() {
        if (head == null)
            System.out.println("List Is Empty");
        else {
            Student tmp;
            tmp = head.next;
            head = tmp;
        }

    }

    /**
     * Liste içerisinden verilen student nesnesini siler.
     * 
     * @param student : Silinecek olan student nesnesi
     */
    public void DeleteElement(Student student) {
        if (head == null)
            System.out.println("List Is Empty");
        else {
            Student now, after;
            now = head;
            while (now != null) {
                if (student.content == now.next.content) {
                    after = now.next.next;
                    now.next = after;
                    break;
                }
                now = now.next;
            }
        }
    }
}
