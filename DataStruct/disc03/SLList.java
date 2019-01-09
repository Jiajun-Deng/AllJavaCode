

public class SLList {

    private class IntNode {/** Nested class*/

        public int item;

        public IntNode next;

        public IntNode(int item, IntNode next) {

            this.item = item;

            this.next = next;

        }
    }

    private IntNode first;

    /** Add an item to the front of the list*/
    public void addFirst(int x) {

        first = new IntNode(x, first);

    }

    /** Print out elements in the list in order*/
    public void print(){

        IntNode p = first;

        while(p != null){

            System.out.print(p.item + " ");

            p = p.next;

        }

        System.out.println();
    }

/** 1.1
 *  Insert method: takes in an integer x and
 *  inserts it at the given position. If the position is after
 *  the end of the list, insert the new node at the end.
 *  For example, if the SLList is 5   6   2, insert(10, 1)
 *  results in 5  10  6  2.
 * */
    public void insert(int item, int position){

        IntNode p = first;

        while(p.next != null && position != 1){

            p = p.next;

            position--;
        }

        p.next = new IntNode(item, p.next);

    }

    /** 1.2
     * Reverse method 1: to the SLList class that reverses the elements.
     * Do this using the existing IntNodes (you should not use new).
     * */
    public void reverse() {//iterative way

        IntNode prev = null;

        IntNode cur = first;

//        if (first.next == null || first == null)

        while(cur != null){

            IntNode tmp = cur.next;

            cur.next = prev;

            prev = cur;

            cur = tmp;

        }
        first = prev;
    }

    /** 1.3
     * Reverse method 2: recursive method to revese a list.
     * (you may need a helper method).
     * */
    public void reverse2(){

        first = reverseHelper(first);

    }

    public IntNode reverseHelper(IntNode head) {//confused

        if (head == null || head.next == null) return head;

        IntNode res;

        res = reverseHelper(head.next);

        head.next.next = head; //node.next.next  == null before the set operation.
        // In this set operation, current node is referenced by (origianl)next node.

        head.next = null;

        return res;

    }


    public static void main(String[] args){

        SLList l = new SLList();

        l.addFirst(2);

        l.addFirst(6);

        l.addFirst(5);

        l.insert(10,5);

        l.print();

        l.reverse();

        l.print();

        l.reverse2();

        l.print();

    }

}
