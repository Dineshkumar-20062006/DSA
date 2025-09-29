import java.util.*;

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class singlyLinkedList{
    Node head = null;
    int noOfNode=0;
    
    void addNode(int data){
        Node newNode = new Node(data);// 4
        if(head == null){ // true 
            newNode.next = head; // 4|null
            head = newNode;// head = 4
	        noOfNode++;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
            
        }
        ptr.next=newNode;
        noOfNode++;
        
    }
    
    void insertNode(int pos,int data){
        Node ptr = head;
        Node newNode = new Node(data);
        if(pos == 0 ){
            newNode.next=head;
            head = newNode;
            noOfNode++;
            return;
        }
        if(pos>noOfNode){
            addNode(data);
            return;
        }
        for(int ind = 0;ind<pos-1;ind++){
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
        noOfNode++;
        
        
    }
    
    
    
    
    void delNodePos(int pos){
        if(pos==0){
            head=head.next;
            noOfNode--;
            return;
        }
        if(pos<0||pos>noOfNode){
            System.out.print("Invalid position");
            return;
        }
        Node ptr=head;
        for(int ind = 0 ; ind<pos-1 ; ind++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        noOfNode--;
    }
    void delNodeValue(int key){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        if(head.data==key){
            head=head.next;
            noOfNode--;
            return;
        }
        Node ptr=head;
        
        while(ptr.next!=null && ptr.next.data != key){
            ptr=ptr.next;
        }
        if(ptr.next==null){
            System.out.print("value is not there");
        }
        ptr.next=ptr.next.next;
        noOfNode--;
       
    }
    
    void search(int target){
        Node ptr=head;
        while(ptr.next !=null){
            if(ptr.data == target){
                System.out.print("target are in the list");
            }
            ptr=ptr.next;
        }
        if(ptr.next == null){
            System.out.print("target are not in the list");
        }
    }



    
    void printNode(){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
	System.out.println();
        System.out.print("no of nodes"+noOfNode);
	System.out.println();
    }
    
    public static void main(String[] args){
        singlyLinkedList sll = new singlyLinkedList();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int rnd=rand.nextInt(1000);
            sll.addNode(rnd);
        }
        sll.printNode();
        sll.insertNode(2,50);
	sll.printNode();
        sll.delNodePos(3);
        sll.printNode();
	sll.delNodeValue(50);
	sll.printNode();
    }
    
   
}

