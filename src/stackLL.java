import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class stackLL {

    //using liked list
//    static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//
//    }
//
//    static class Stack{
//        public static Node head;
//        public static boolean isempty(){
//            return head==null;
//        }
//        public static void push(int data){
//            Node newnode= new Node(data);
//            if(isempty()){
//               head = newnode;
//               return;
//            }
//            newnode.next=head;
//            head=newnode;
//
//        }
//
//        public static int pop(){
//            if(isempty()){
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top; // this returns the  data that  is poped out/
//
//        }
//        public static int peek(){
//            if(isempty()){
//                return -1;
//            }
//            return head.data;
//
//        }
//
//    }


    //using Array list

    public class Stackclass{
        class Stack{
            static ArrayList<Integer> list = new ArrayList<>();
            public static boolean isempty(){
                return list.size() ==0;

            }
            public static void push(int data){
                if(isempty()){
                    list.add(data);
                }
            }

            public static int pop(){
                if(isempty()){
                    return -1;
                }
                int top =list.get(list.size()-1);
                return top;
            }

            public static int peek(){
                if(isempty()){
                    return -1;
                }
                return list.get(list.size()-1);
            }
        }

    }







    public static void main(String[] args) {
        Stack s = new Stack();
         s.push(1);
        s.push(2);
        //s.pop();
        System.out.println(s.peek());



    }
}
