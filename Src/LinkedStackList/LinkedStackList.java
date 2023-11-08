package Src.LinkedStackList;

import Src.Model.LinkedStackList.Numbers;

public class LinkedStackList {
    Numbers top;
    public int length;

    public LinkedStackList() {
        top = null;
        length = 0;
    }

    public void push(int content) {
        Numbers number = new Numbers(content);
        if (top == null)
            top = number;
        else {
            number.prev = top;
            top = number;
        }
        length++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("List is empty");
            return Integer.MAX_VALUE;
        }
        {
            int content = top.content;
            top = top.prev;
            return content;
        }
    }

    public void AllElement() {
        if (top != null) {
            Numbers tmp = top;
            while (tmp != null) {
                System.out.println(tmp.content);
                tmp = tmp.prev;
            }
        }
    }

}
