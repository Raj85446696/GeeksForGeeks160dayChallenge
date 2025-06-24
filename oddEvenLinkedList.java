public class oddEvenLinkedList {
    ListNode head ; 
    class ListNode{
        int data ; 
        ListNode next ; 
        ListNode(int data){
            this.data = data ; 
        }
    }

    public ListNode oddEvenList(ListNode head){
        if(head==null){
            System.out.println("Linkedlist not exit's");
        }
        ListNode odd = head ; 
        ListNode even = head.next ; 
        ListNode evenHead = even ; 
        while(even!=null && even.next!=null){
            odd.next = even.next ; 
            odd = odd.next ; 

            even.next = odd.next ; 
            even = even.next ; 
        }
        odd.next = evenHead ; 
        return head ; 

    }

    public void createLinkedList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        head = a ; 
        a.next = b ; 
        b.next = c ; 
        c.next = d ; 
        d.next = e ; 
    }

    public void Traverse(ListNode head){
        if(head==null){
            System.out.println("Linkedlist not exit's");
        }else{
            ListNode temp = head ; 
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        oddEvenLinkedList o = new oddEvenLinkedList();
        o.createLinkedList(); 
        o.Traverse(o.head);
        ListNode newList = o.oddEvenList(o.head);
        o.Traverse(newList);

    }
}
