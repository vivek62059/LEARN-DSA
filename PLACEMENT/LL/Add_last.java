 import java.io.*;
import java.util.*;

public class Add_last{
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here
      Node temp=new Node();
      temp.data=val;
      temp.next=null;
      
    
    if(size==0){
        head=tail=temp;
        
    }
    else{
        tail.next=temp;
        tail=temp;
    }
    size++;
  }
  public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
    System.out.println();
  }
  public void removeFirst(){
    if(size==0){
        System.out.println("ll is empty");
    }
    else if(size==1){
        head=tail=null;
        size=0;
    }
    else{
        head=head.next;
        size--;
  // write your code here
}
}
//to get value of a ll
public int getFirst(){
    if(size==0){
        System.out.println("list is empty");
        return -1;
    }
    else{
        return head.data;
    }
}
public int getAt(int idx){
    if(size==0){
        System.out.println("list is empty");
        return -1;
    }
    else if(idx<0 || idx>=size){
        System.out.println("invalid arguments");
    }else{
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
            
        }
        return temp.data;
    }
    public int getLast(){
        if(size==0){
            System.out.println("list is empty");
            return -1;
        }
        else{
            return tail.data;
        }
    }
}
     public void addFirst(int val){
        Node temp=new Node();
        temp.data=val;
        temp.next=null;
        temp.next=head;
        head=temp;
        if(size==0){
            tail=temp;
        }
        size++;
     }
}

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
} 
    

