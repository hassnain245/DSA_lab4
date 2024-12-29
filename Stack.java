/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;
public class Stack {
  public class Node{
        
  int data;
  Node next;
    Node(int data){
      this.data=data;
      this.next=null;
  }
    }
private Node top;
 Stack(){
  this.top=null;  
}
 public void push(int data){
  Node newnode=new Node(data);
  if(top==null){
      top=newnode;
      return;
  }
  newnode.next=top;
  top=newnode;
 }
 public int peek(){
     return top.data;
 }
 public int pop(){
   int temp=top.data;
   top=top.next;
   return temp;
 }
 public boolean isempty(){
     return top==null;
 }
 public void display(){
     if(top==null){
         
     }else{
         Node current=top;
         while(current!=null){
     System.out.println(current.data);
     current=current.next;
         }
     }
 }
    public static void main(String[] args) {
     Stack s1=new Stack();
     s1.push(10);
     s1.push(20);
     s1.push(30);
        System.out.println(s1.peek());
        System.out.println(s1.peek());
        System.out.println(s1.isempty());
        s1.display();
    }
    
}
