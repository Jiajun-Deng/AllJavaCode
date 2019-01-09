public class SLList {

    public class IntNode {//nested class

        public int item;

        public IntNode next;

        public IntNode(int i, IntNode n) {

            item = i;

            next = n;

        }

    }



    private IntNode sentinel;

    private int size;


/**Create an empty SLlist*/
    public SLList() {

        sentinel = new IntNode(60, null);

        size = 0;

    }



    public SLList(int x) {
        sentinel = new IntNode(60, null);//set the next pointer to null firstly, then it will be reset.

        sentinel.next = new IntNode(x, null);

        size = 1;

    }



    /** Adds an item to the front of the list. */

    public void addFirst(int x) {

        sentinel.next = new IntNode(x, sentinel.next);

        size += 1;

    }



    /** Retrieves the front item from the list. */

    public int getFirst() {

        return sentinel.next.item;

    }



    /** Returns the number of items in the list. */

    public int size() {

        return size;

    }



    /** Adds an item to the end of the list. */

    public void addLast(int x) {

        IntNode p = sentinel;

        size += 1;

/**        if(first == null){
            first = new IntNode(x, null);
            return;
        }
*/
        /* Advance p to the end of the list. */

        while (p.next != null) {

            p = p.next;

        }

        p.next = new IntNode(x, null);

    }



    /** Crashes when you call addLast on an empty SLList. Fix it. */

    public static void main(String[] args) {

        SLList x = new SLList();

        x.addLast(5);

        x.addFirst(15);

        System.out.println(x.size());

        System.out.println(x.getFirst());

    }

}