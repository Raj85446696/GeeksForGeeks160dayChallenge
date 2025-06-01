public class ReverseNode {
    Node head = null ; 
    //create a Node
    class Node{
        int data = 0  ; 
        Node next  = null; 

        Node(int data){
            this.data = data ; 
            this.next = null ; 
        }
    }

    // to insert data 
    public void CreateNode(){
        Node first = new Node(1); 
        Node second = new Node(2); 
        Node third = new Node(3); 
        Node fourth = new Node(4);
        Node fifth = new Node(5);  

        head = first ; 
        first.next = second ; 
        second.next = third ;
        third.next = fourth ; 
        fourth.next = fifth ; 
    }

    // to traverse linkedlist 
    public void Traverse(){
        if(head==null){
            System.out.println("Empty linkedlist");
        }else{
            Node temp = head ; 
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp= temp.next ; 
            }
            System.out.println("null");
        }

    }


    // Reverse Linkedlist 
    public Node reverseNode(){
        Node prev = null ; 
        Node curr = head ; 
        Node next = null ; 
        while(curr!=null){
            next = curr.next ; 
            curr.next = prev ; 
            prev = curr ; 
            curr = next ; 
        }
        return prev ; 
    }
    public static void main(String[] args) {
        ReverseNode r = new ReverseNode(); 
        r.CreateNode();
        r.Traverse();
        r.head = r.reverseNode(); 
        r.Traverse();
    }

}
