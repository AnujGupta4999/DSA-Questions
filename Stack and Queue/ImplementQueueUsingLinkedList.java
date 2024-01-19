//coding ninja

public class Solution extends Queue{
    Node head = null;
    public void push(int x) {
        Node newNode = new Node(x);
        if(front==null && rear==null){
            front=newNode;
            rear=newNode;
        } else{
            rear.next=newNode;
            rear=newNode;

        }
    }

    public int pop() {
        int data =-1;
         if(front==null || rear==null){
            return data;
        }else if(front!=null && rear!=null && front==rear){
                data = front.data;
                front=null;
                rear=null;
                return data;
        }else{
            Node frontnext = front.next;
            data = front.data;
            front.next=null;
            front=frontnext;
            return data;
        }
        
    }
}
