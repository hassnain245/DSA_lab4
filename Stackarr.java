/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackarr;
import java.util.Scanner;
public class Stackarr {
 int arr[];
 int top=-1;
 public void size(int size){
     arr=new int[size];
 }
public void push(int data){
    if(top>=arr.length){
        System.out.println("Stake over flow");
    }else{
 top++;
 arr[top]=data; }}

public int peek(){
  return arr[top];  
}
public void pop(){
    if(top<0){
        System.out.println("Stake under flow");
    }else{
    System.out.println(arr[top]);
    top--;}
}
public void display(){
    for(int i=0; i<=top; i++){
        System.out.println(arr[i]);
    }
}
public boolean isempty(){
    return top==-1;
}
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
 System.out.print("Enter the size of your index: ");
int size=input.nextInt();
Stackarr s2=new Stackarr();
 s2.size(size);
s2.push(10);
s2.push(20);
s2.push(30);
s2.push(40);
s2.push(50);
s2.display();
System.out.print("Its a pop value: ");
s2.pop();
s2.display();
System.out.println("its a peak value: "+s2.peek());
s2.display();
    }
    
}
