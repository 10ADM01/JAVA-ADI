public class LL {
   Node head;
   class Node{
       String data;
       Node next;
       Node(String data){
           this.data=data;
           this.next=null;
       }
   }

   //addfirst
    public void addfirst(String data){
       Node newnode = new Node(data);
       if(head==null){
           head=newnode;
           return;
       }
       newnode.next=head;
       head=newnode;
    }

    public void addlas(String data){
       Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    //print
    public void printt(){
       if(head==null){
           System.out.println("the list is empty");
       }
        Node currnode = head;
        while(currnode!=null){
            if(currnode.next==null){
                System.out.print(currnode.data);
                return;
            }
            System.out.print(currnode.data +"->");
            currnode=currnode.next;
        }

    }
//delete first
    public void delf(){
       head=head.next;
    }

    //del last
    public void dellas(){
       Node currnode = head;
       while(currnode.next!=null){
           if(currnode.next.next==null){
               currnode.next=null;
               return;
           }
           currnode=currnode.next;
       }

    }


    public static void main(String[] args) {
       LL list = new LL();
       list.addfirst("hai");
       list.addlas("da");
       list.addlas("punda");
       list.dellas();
       list.printt();

    }
}
