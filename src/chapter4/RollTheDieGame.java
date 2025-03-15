package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Random random= new Random();
        int currentSpace=0;
        int maxSpace=20;

         for(int i=0; i<5;i++){
             int die= random.nextInt(6)+1;
             System.out.println("Roll #:"+(i+1)+ " You've rolled a "+die);
             if(i==3 && maxSpace-currentSpace>6){
                System.out.println("You loose. You will need " +(maxSpace-currentSpace)+" to win which is Impossible.");
                break;
             }
             currentSpace=currentSpace+die;

             if (currentSpace==maxSpace){
                 System.out.println("You're on space " + currentSpace + ". Congrats, you win!");
                 break;
             }
             if(currentSpace>maxSpace){
                 System.out.println("You're on space "+currentSpace +" You loose");
                 break;
             }
             if (currentSpace<maxSpace)
             {
                 System.out.println("You're on space "+currentSpace +" and have " +(maxSpace-currentSpace)+" more to go");
             }

         }
            if(currentSpace<maxSpace) {
                System.out.println("Your turn is over. You loose");
            }

    }
}
