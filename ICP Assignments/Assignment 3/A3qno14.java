import java.util.*;
public class A3qno14{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("\nEnter 0 for Scissor\nEnter 1 for Rock\nEnter 2 for Paper");
int en=sc.nextInt();
int ci=((int)Math.random()*3);
if ((ci == 0) && (en == 2)){
System.out.println("Scissor vs Paper.\nYou lose!");}
else if ((ci == 1) && ( en== 0)){
System.out.println("Rock vs Scissor.\nYou lose!");}
else if ((ci == 2) && (en ==1 )){
System.out.println("Paper vs Rock.\nYou lose!");}
else if ((ci == 0) && (en == 1)){
System.out.println("Scissor vs Rock.\nYou win!");}
else if ((ci == 1) && (en == 2)){
System.out.println("Rock vs Paper.\nYou win!");}
else if ((ci == 3) && (en== 1)){
System.out.println("Paper vs Scissor.\nYou win!");}
else if ((ci == 1) && (en == 1)){
System.out.println("Scissor vs Scissor.\nIt's a draw!");}
else if ((ci == 2) && (en == 2)){
System.out.println("Rock vs Rock.\nIt's a draw!");}
else if ((ci == 3) && (en == 3)){
System.out.println("Paper vs Paper.\nIt's a draw!");}
}}