class listlinked{
    Node head;
    private int size;
    listlinked(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
        }

        public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

    }
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode= head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    public void printlis(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node currnode = head;

        while(currnode !=null){
            if(currnode.next==null){
                System.out.println(currnode.data);
                return;
            }
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }


    }
    //deletefirst
    public void  delfir(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
        size--;


    }
    //dellast
    public void dellast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        Node currnode=head;
        size--;
        while(currnode.next!=null){
            if(currnode.next.next==null){
                currnode.next=null;
                return;
            }
            currnode=currnode.next;

        }
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        listlinked list = new listlinked();
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("he");
        list.addlast("bastard");
        list.printlis();
        System.out.println(list.size());
    //    list.delfir();
        list.delfir();
        list.dellast();
        list.printlis();
        System.out.println(list.size());
    }
}