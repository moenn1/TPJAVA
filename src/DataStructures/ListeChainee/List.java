package DataStructures.ListeChainee;

public class List {
    Node head;

    public List(Object x){
        head = new Node(x);
    }

    void add(Object x){
        Node newNode = new Node(x);
        if(head==null){
            head = newNode;
        }
        else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    void deleteLast(){
        if(head==null) return;
        Node tmp = head;
        while(tmp.next.next!=null){
            tmp=tmp.next;
        }
        tmp.next = null;
    }

    void deleteBegin(){
        if(head==null) return;
        head = head.next;
    }

    void deletePos(int index){
        if(head==null) return;
        Node tmp = head;
        int i=0;
        while(i<index-1 && tmp.next.next!=null){
            tmp=tmp.next;
            i++;
        }
        if(tmp.next.next!=null) tmp.next = tmp.next.next;
        else tmp.next = null;
    }

    void print(){
        if(head==null) System.out.println("Empty list");
        else{
            Node tmp = head;
            while(tmp!=null){
                System.out.print(tmp.data.toString() + " -> ");
                tmp=tmp.next;
            }
            System.out.println("NULL");
        }
    }


}
