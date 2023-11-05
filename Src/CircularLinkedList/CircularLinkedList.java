package Src.CircularLinkedList;

import Src.Model.Patient;

public class CircularLinkedList {
    public int length;
    public Patient head;

    /**
     * Circular linked listin linked listten farkı tail tutulmaz ve tailin nexti
     * head i gösterir<br>
     * <img src="../assets/circularlinkedlist.png" width="200" height="200" /><br>
     * Circular Linked List oluştur.
     *
     */
    public CircularLinkedList() {
        head = null;
        length = 0;
    }

    /**
     * Listenin başına yeni eleman ekler.<br>
     * </br>
     * Aldığı parametreyi içeride bir Patient nesnesinin içine atar.
     * 
     * @param content eklenecek olan <b><i>tamsayı</i></b>
     * 
     */
    public void AddElementInHead(int content) {
        Patient patient = new Patient(content);
        if (head == null) {
            head = patient;
            patient.next = patient;
        } else {
            Patient tmp = head.next;
            patient.next = head;
            while (tmp.next != head)
                tmp = tmp.next;
            tmp.next = patient;
            head = patient;
        }
        length++;
    }

    public void AddElementInTail(int content) {
        Patient patient = new Patient(content);
        if (head == null) {
            head = patient;
            patient.next = patient;
        } else {
            Patient tmp = head.next;
            patient.next = head;
            while (tmp.next != head)
                tmp = tmp.next;
            tmp.next = patient;
            patient.next = head;
        }
        length++;
    }

    /**
     * <h3>Listenin Başından Eleman Silme</h3>
     * Listenin Başındaki elemanı siler.<br>
     * </br>
     * <ul>
     * İncelenen durumlar
     * <li>Eleman sayısı = 0</li>
     * <li>Eleman sayısı > 1</li>
     * <li>Eleman sayısı = 1</li>
     * </ul>
     */
    public void DeleteElementInHead() {
        // |x| = 0
        if (head == null)
            System.out.println("List is empty");
        // |x| > 1
        else if (head.next != head) {
            Patient tmp = head.next;
            while (tmp != head)
                tmp = tmp.next;
            tmp.next = head.next;
            head = head.next;
        }
        // |x| = 1
        else
            head = null;
        length--;
    }

    /**
     * Listenin sonundaki elemanı siler.<br>
     * </br>
     * listede eleman olmamam, 1 eleman olma ve birden fazla eleman olma durumlarını
     * inceler.
     */
    public void DeleteElementInTail() {
        // |x| = 0
        if (head == null)
            System.out.println("List is empty");
        // |x| > 1
        else if (head.next != head) {
            Patient tmp = head;
            Patient prev = tmp;
            while (tmp.next != head) {
                prev = tmp;
                tmp = tmp.next;
                prev.next = head;
            }
        }
        // |x| = 1
        else
            head = null;
        length--;
    }

    public void AddElementInBetweenWithContent(int newElementContent, int oldContent) {
        Patient tmp = head;
        Patient newPatient = new Patient(newElementContent);

        if (head == null)
            System.out.println("List is empty");
        else if (tmp.next == head)
            AddElementInTail(newElementContent);
        else {
            do {
                if (tmp.content == oldContent) {
                    if (tmp.next == head) {
                        AddElementInTail(newElementContent);
                    } else {
                        newPatient.next = tmp.next;
                        tmp.next = newPatient;
                    }
                    break;
                }
                tmp = tmp.next;
            } while (tmp != head);
        }
        length++;
    }

    public void DeleteElementInBetweenWithContent(int deletedContent) {
        Patient tmp = head;
        Patient prev = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (tmp.content == deletedContent)
            DeleteElementInHead();
        do {
            if (tmp.content == deletedContent) {
                if (tmp.next != head) {
                    prev.next = tmp.next;
                    break;
                } else {
                    DeleteElementInTail();
                    break;
                }
            }
            prev = tmp;
            tmp = tmp.next;
        } while (tmp != head);
        length--;
    }

    public void RemoveList() {
        head = null;
        length = 0;
    }

    public void ShowAllNode() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Patient tmp = head;
        do {
            System.out.println(tmp.content);
            tmp = tmp.next;
        } while (tmp != head);
    }

}
