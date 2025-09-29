import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoubleLinkedList{
    Node head = null;
    int noOfNodes=0;
    
    void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode.next=head;
            head = newNode;
            noOfNodes++;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr=ptr.next;
        }
        ptr.next = newNode;
        newNode.prev = ptr;
        noOfNodes++;
    }
    
    void insertNode(int pos , int data){
        Node newNode = new Node(data);
        if(pos<0){
            System.out.print("invalid position");
            return;
        }
        if(pos == 0 ){
            if(head == null){
                head=newNode;
                noOfNodes++;
                return;
                
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            noOfNodes++;
            return;
        }
        if(pos>=noOfNodes){
            add(data);
            return;
        }
        // i/p 10 20 30  ^ 40 50 60 insert(3,100)
        Node ptr = head;//ptr = 10
        for(int ind = 0 ; ind <pos-1;ind++){//ind =0 1 2(false)
            ptr=ptr.next;// 20 30
        }
        //ptr = 30
        newNode.next=ptr.next;//null|100|40 
        newNode.prev=ptr;// 30|100|40
        ptr.next.prev=newNode;// 100|40|50
        ptr.next = newNode;// 20|30|100
        noOfNodes++;
     }
    
    void delNodePos(int pos){
        if(pos == 0){
            if(head.next!=null){
            head=head.next;
            noOfNodes--;
            return;
            }
            else{
                
                head=null;
                noOfNodes--;
                return;
            }
        }
        if(pos<0 || pos>=noOfNodes){
            System.out.print("Invalid Position");
            return;
        }
        Node ptr = head;
        for(int ind=0;ind<pos-1;ind++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        
        if(ptr.next !=null){
        ptr.next.prev=ptr;
        }
        noOfNodes--;
        
    }
    
    void delNodeValue(int target){
        if(head==null){
            System.out.print("List is empty");
        }
        if(head.data == target){
            head = head.next;
            noOfNodes--;
            return;
        }
        Node ptr = head;
        while(ptr.next!=null && ptr.next.data != target){
            ptr=ptr.next;
        }
        if(ptr.next==null){
            System.out.print("the value "+target+" not in the list ");
            return;
        }
        ptr.next=ptr.next.next;
        if(ptr.next==null){
            ptr.next.prev=ptr;
        }
        noOfNodes--;
    }
    
    void nodeSearch(int key){
        Node ptr = head;
        while(ptr != null){
            if(ptr.data == key){
                System.out.print("Node found");
            }
            ptr = ptr.next;
        }
        if(ptr == null){
            System.out.print("Node not found");
        }
    }
    
    void printNode(){
        Node ptr = head;
        while(ptr!= null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println();
        System.out.print("no of nodes = "+noOfNodes);
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rnd = new Random();
        int rand;
        for(int i = 0 ; i<n ; i++){
            rand = rnd.nextInt(100);
            dll.add(rand);
        }
         dll.printNode();

        dll.insertNode(2, 99);
        dll.printNode();

        dll.delNodePos(0); // delete head
        dll.printNode();

        dll.delNodePos(2); // delete middle
        dll.printNode();

        dll.delNodePos(dll.noOfNodes - 1); // delete last
        dll.printNode();

        dll.delNodeValue(99); // delete by value
        dll.printNode();

        dll.nodeSearch(9); // search example
    }

    
}