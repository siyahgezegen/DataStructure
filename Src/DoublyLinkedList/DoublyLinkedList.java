package Src.DoublyLinkedList;

import Src.Model.Person;

/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

    private Person head;
    private Person tail;
    public int length;

    /**
     * Create Constructer
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    /**
     * Başa eleman ekler <\n> sdsd
     * 
     * 
     * @param person Eklenecek olan Person nesnesi
     */
    public void AddElementInHead(Person person) {
        if (head != null) {
            person.next = head;
            head.prev = person;
            head = person;
            length++;
        } else {
            head = person;
            tail = person;
            length++;

        }
    }

    /**
     * Kuyruğa(sona) eleman ekler
     * 
     * @param person Eklenecek olan Person nesnesi
     */

    public void AddElementInTail(Person person) {
        if (head != null) {
            tail.next = person;
            person.prev = tail;
            tail = person;
            length++;
        } else {
            head = person;
            tail = person;
            length++;
        }
    }

    /**
     * Belirlenen content'ten sonra eleman ekler
     * 
     * @param person  eklenecek olan Person nesnesi
     * @param content hangi sayıdan sonra eklenecek
     */
    public void AddElementInBetween(Person person, int content) {
        Person tmp = head;
        Boolean control = false;
        if (head == null)
            System.out.println("List is empty");
        else {
            while (tmp != null) {
                if (tmp.content == content) {
                    if (tmp.next == null)
                        AddElementInTail(person);
                    else {
                        person.next = tmp.next;
                        person.prev = tmp;
                        tmp.next.prev = person;
                        tmp.next = person;
                        length++;
                    }
                    control = true;
                    break;
                }
                tmp = tmp.next;
            }
            if (!control)
                System.out.println("Element is not found");
        }

    }

    /**
     * aradan eleman siler
     * 
     * @param content silinecek olan elemanın content'i
     */
    public void DeleteElementInBetween(int content) {
        Person tmp = head;
        Boolean control = false;
        if (head == null)
            System.out.println("List is empty");

        else {
            while (tmp != null) {
                if (tmp.content == content) {
                    if (tmp.next == null)
                        DeleteElementInTail();

                    else {
                        tmp.prev.next = tmp.next;
                        tmp.next.prev = tmp.prev;
                        length--;
                    }
                    control = true;
                    break;
                }
                tmp = tmp.next;
            }

        }
        if (!control)
            System.out.println("Element is not found");
    }

    /**
     * Baştan eleman siler
     */
    public void DeleteElementInHead() {
        // S = dizi eleman sayısı
        if (head.next != null) {
            // S>1
            head = head.next;
            head.prev = null;
            length--;

        } else if (head != null) {
            // S = 1
            tail = null;
            head = null;
            length--;
        } else {
            // S = 0
            System.out.println("List Is Empty");
        }
    }

    /**
     * Kuyruktan eleman siler
     */
    public void DeleteElementInTail() {
        // S = dizi eleman sayısı
        if (head.next != null) {
            // S>1
            tail = tail.prev;
            tail.next = null;
            length--;
        } else if (head != null) {
            // S = 1
            tail = null;
            head = null;
            length--;

        } else {
            // S = 0
            System.out.println("List Is Empty");
        }
    }

    /**
     * Tüm elemanları getirir
     * not: elemanları döndürür
     */
    public int[] GetAll() {
        int[] list = new int[length];
        if (head != null) {
            int index = 0;
            Person tmp = head;
            while (tmp != null) {
                list[index] = tmp.content;
            }
            return list;
        }
        return null;
    }

}