package data.structure;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public boolean hasNext() {
        return next != null;
    }

    public int getData() {
        return data;
    }
}
