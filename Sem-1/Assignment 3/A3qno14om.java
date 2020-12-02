import java.util.Scanner;
public class A3qno14om{
public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    int comp, player;
    int point = 1, pointCom = 0, pointPlayer = 0;

    System.out.println("This is a game of Scissor-Rock-Paper.\n");

    while((pointPlayer != 3) && (pointCom != 3)){
        System.out.println("\nEnter 1 for Scissor\nEnter 2 for Rock\nEnter 3 for Paper");
        player = n.nextInt();
        comp = (1 + (int)(Math.random() * 3));

        if ((comp == 1) && (player == 3)){
            System.out.println("Scissor vs Paper.\nYou lose!");
            pointCom += point;}
        else if ((comp == 2) && (player == 1)){
            System.out.println("Rock vs Scissor.\nYou lose!");
            pointCom += point;}
        else if ((comp == 3) && (player == 2)){
            System.out.println("Paper vs Rock.\nYou lose!");
            pointCom += point;}
        else if ((comp == 1) && (player == 2)){
            System.out.println("Scissor vs Rock.\nYou win!");
            pointPlayer += point;}
        else if ((comp == 2) && (player == 3)){
            System.out.println("Rock vs Paper.\nYou win!");
            pointPlayer += point;}
        else if ((comp == 3) && (player== 1)){
            System.out.println("Paper vs Scissor.\nYou win!");
            pointPlayer += point;}
 else if ((comp == 1) && (player == 1)){
            System.out.println("Scissor vs Scissor.\nIt's a draw!");}
        else if ((comp == 2) && (player == 2)){
            System.out.println("Rock vs Rock.\nIt's a draw!");}
        else if ((comp == 3) && (player == 3)){
            System.out.println("Paper vs Paper.\nIt's a draw!");}
        else
            System.out.println("You can only choose between 1, 2, and 3...");
    }
    if (pointCom >= 3)
        System.out.println("\nYou LOST...");
    else if (pointPlayer >= 3)
        System.out.println("\nYou WON...");

}
}