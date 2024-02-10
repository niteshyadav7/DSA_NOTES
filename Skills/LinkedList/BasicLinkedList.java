package LinkedList;

public class BasicLinkedList {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // print the linkedList
  public static void printLinkedListItr(Node head) {
    Node temp = head;
    while (temp != null) {
      if (temp.next == null) {
        System.out.print(temp.data);
      } else {
        System.out.print(temp.data + " -> ");
      }
      temp = temp.next;
    }
  }

  public static void printLinkedListRec(Node head) {
    Node temp = head;
    if (temp == null)
      return;
    if (temp.next == null) {
      System.out.print(temp.data);
    } else {
      System.out.print(temp.data + " -> ");
    }
    printLinkedListRec(temp.next);
  }

  public static void main(String[] args) {
    // Intialisze the value.
    Node s1 = new Node(5);
    Node s2 = new Node(3);
    Node s3 = new Node(7);
    Node s4 = new Node(1);
    Node s5 = new Node(11);
    // linking the linkedList.
    s1.next = s2;
    s1.next.next = s3;
    s1.next.next.next = s4;
    s4.next = s5;

    // Invoking the printFun.
    printLinkedListItr(s1);
    printLinkedListRec(s1);
  }
}
