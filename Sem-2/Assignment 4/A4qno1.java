import java.util.*; 
class node { 
protected int regd_no;
protected float mark;
protected node next; 
} 
public class A4qno1{
public static node create(node start){
Scanner sc=new Scanner (System.in);
char ch;   
node a=new node();   
do{
node n=new node();
System.out.println("Enter Registrstion number");    
n.regd_no=sc.nextInt();   
System.out.println("Enter Mark");
n.mark=sc.nextFloat();    
n.next=null;    
if(start==null){ 
start=n;    
a=n;
}    
else {
a.next=n;
a=n;
}
System.out.println("Enter Y to add next value in node.");
ch=sc.next().charAt(0);
}
while(ch=='Y'); 
return start;  
} 
public static node display(node start){ 
node n=new node();   
n=start;
if(start==null){
System.out.println("Empty list");
}  
else{
System.out.println("List Created");
while(n!=null){ 
System.out.print("Registration number "+n.regd_no+" Mark "+n.mark);
n=n.next; 
}
}
return start; 
} 
public static node insbeg(node start){ 
Scanner sc=new Scanner (System.in); 
node n=new node();
System.out.println("Enter Registration number and marks");
n.regd_no=sc.nextInt();
n.mark=sc.nextFloat();
n.next=start;
start=n;
return start;
}
public static node insend(node start){
Scanner sc=new Scanner (System.in);
node n=new node();
node a=new node();
System.out.println("Enter Registration number and marks");
a.regd_no=sc.nextInt();
a.mark=sc.nextFloat();
n=start;
a.next=null;
while(n.next!=null){
n=n.next;
}  
n.next=a;
return start;  
}    
public static node insany(node start){
Scanner sc=new Scanner (System.in);
node n=new node();
node a=new node();
System.out.println("Enter Registration number and marks");
a.regd_no=sc.nextInt();
a.mark=sc.nextFloat();
n=start;
a.next=null;
System.out.println("Enter location");
int loc=sc.nextInt();
for(int i=1;i<loc-1 && n.next!=null;i++){
n=n.next;
}   				
a.next=n.next;
n.next=a;
return start;  
} 
public static node search(node start){
node n=new node();    	
n=start;   
if(start==null){
System.out.println("List is empty.");
}
else{ 
Scanner sc=new Scanner (System.in);
System.out.println("Enter Registration number to search");
int q=sc.nextInt();
while(n!=null){
if(q==n.regd_no){
System.out.print("Enter marks to be updated");
n.mark=sc.nextFloat();
}       
n=n.next;  
} 
} 
return start;
} 
public static node delbeg(node start){ 
Scanner sc=new Scanner (System.in);   
System.out.println("Node to  deleted  "+start.regd_no+" "+start.mark+ "at"+ start); 
start=start.next; 
System.out.println(start);
return start; 
} 
public static node delend(node start){ 
Scanner sc=new Scanner (System.in);   
node n=start;
node o=new node();
while(n.next!=null){    
o=n; 
n=n.next; 
}
System.out.println("element to be deleted "+n.regd_no+" "+n.mark+" at "+n);   
o.next=null;
return start;
}
public static node delany(node start){  
Scanner sc=new Scanner (System.in);
node n=start; 
node q=new node();
System.out.println("Enter location");
int l=sc.nextInt();   
for(int i=1;i<l && n.next!=null;i++){
q=n;    
n=n.next;    
}   
q.next=n.next;
return start; 
} 
public static node rev(node start){
Scanner sc=new Scanner (System.in);
node n=new node();
node o=new node();
node p=new node();
n=start;
o=null;
while(n!=null){  
p=n.next;
n.next=o;
o=n; 
n=p;
}
start=o;
return start;
} 
public static node sort(node start){
node n=start;
node o=new node();
while(n.next!=null){
o=n.next;
if(n.mark<o.mark){
float t=n.mark;
n.mark=o.mark;
o.mark=t; 
}    
n=n.next; 
}
return start;
}
public static void main(String[] args) {  
int c;
Scanner sc=new Scanner (System.in);
node start=null;
while(true) { 
System.out.println("****MENU*****"); 
System.out.println("0:Exit"); 
System.out.println("1:Creation");
System.out.println("2:Display"); 
System.out.println("3:Insert at beg");
System.out.println("4:Insert at end");
System.out.println("5:Insert at specific location"); 
System.out.println("6:Search");
System.out.println("7:Delete at beg"); 
System.out.println("8:Delete at end"); 
System.out.println("9:Delete at specific location");
System.out.println("10:Reverse the list");  
System.out.println("11:Sorting the list");   
System.out.println("Enter the choice");   
c=sc.nextInt();   
switch(c)   { 
case 0:
System.exit(0);  
case 1:
start=create(start);
break;  
case 2: 
start=display(start);
break;  
case 3:    
start=insbeg(start);
break;
case 4:
start=insend(start);
break;
case 5:
start=insany(start);
break;   
case 6:  
start=search(start);  
break;
case 7: 
start=delbeg(start); 
break;
case 8:    
start=delend(start);  
break;
case 9:    
start=delany(start);  
break;
case 10:
start=rev(start);    
break;
case 11:
start=sort(start);
break;
default:
System.out.println("Wrong choice");
}
} 
}
} 