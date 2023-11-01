package Src.DoublyLinkedList;

import Src.Model.Person;

/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {

    public Person head;
    public Person tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void AddElementInHead(Person person) {
        if (head != null) {
            person.next = head;
            head.prev = person;
            head = person;
        } else {
            head = person;
            tail = person;

        }
    }

    public void AddElementInTail(Person person) {
        if (head != null) {
            tail.next = person;
            person.prev = tail;
            tail = person;
        } else {
            head = person;
            tail = person;

        }
    }

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

    public void DeleteElementInHead() {
        // S = dizi eleman sayısı
        if (head.next != null) {
            // S>1
            head = head.next;
            head.prev = null;

        } else if (head != null) {
            // S = 1
            tail = null;
            head = null;

        } else {
            // S = 0
            System.out.println("List Is Empty");
        }
    }

    public void DeleteElementInTail() {
        // S = dizi eleman sayısı
        if (head.next != null) {
            // S>1
            tail = tail.prev;
            tail.next = null;

        } else if (head != null) {
            // S = 1
            tail = null;
            head = null;

        } else {
            // S = 0
            System.out.println("List Is Empty");
        }
    }

    public void GetAll() {
        if (head != null) {
            Person tmp = head;
            while (tmp != null) {
                System.out.println(tmp.content);
                tmp = tmp.next;
            }
        }
    }

}