public class DoublyLinkedList {
    class Node{  
        int data;  
        Node previous;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }
    }  
    Node head, tail = null;  
    public void addend(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }
    public void addbeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            newNode.previous=null;
            tail.next=null;
        }
        else{
            head.previous=newNode;
            newNode.next=head;
            newNode.previous=null;
            head=newNode;
        }
    }
    public void deletebeg(){
        if(head!=null){
            head=head.next;
        }
    }
    public void deleteend(){
    if(head!=null){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.previous != null) {
            temp.previous.next = null;
        } else {
            // This means there's only one node in the list
            head = tail = null;
        }
    }
    }
    public void display() {  
        Node current = head;
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
    public static void main(String[] args) {  
        DoublyLinkedList dList = new DoublyLinkedList();  
        dList.addend(1);  
        dList.addend(2);  
        dList.addend(3);  
        dList.addend(4);  
        dList.addend(5);
        System.out.println("after adding to end:");
        dList.display();
        dList.addbeg(6);
        System.out.println();
        System.out.println("after adding to begin:");
        dList.display();
        dList.deletebeg();
        System.out.println();
        System.out.println("after deleting from begin:");
        dList.display();
        System.out.println();
        System.out.println("after deleting from end:");
        dList.deleteend();
        dList.display();
    }  
}  