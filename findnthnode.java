public class findnthnode {
    Node head,tail;

    public findnthnode(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head == null){
            tail = head = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public Node findnth_Node(int pos){
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=pos;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        findnthnode l = new findnthnode();
        l.create(1);
        l.create(5);
        l.create(3);
        l.create(6);
        l.print(l.head);
        Node temp = l.findnth_Node(2);

        System.out.println();
        System.out.println(temp.data);
    }
}