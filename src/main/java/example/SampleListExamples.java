package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SampleListExamples {
    //not literal lists, I mean the list interface's implementations ArrayList and LinkedList
    
    public static void main(String[] args){
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        boolean flag = true;

        Scanner scan = new Scanner(System.in);
        
        while(flag){

            boolean validInteger = false;

           while(!validInteger) {
               //Asking for the integer
               System.out.print("Please write an integer for your ArrayList: ");
               try {
                   Integer value = scan.nextInt();
                   numbers.add(value);
                   validInteger = true;
               } catch (InputMismatchException e) {
                   System.out.println("Enter an integer!");
                   scan.next();
               }
           }

            boolean validBoolean = false;

           while(!validBoolean) {
               //Checking if we continue or stop
               System.out.print("Type \"true\" to continue adding or type \"false\" to stop: ");
               try {
                   flag = scan.nextBoolean();
                   validBoolean = true;
               } catch (InputMismatchException e) {
                   System.out.println("Please enter \"true\" or \"false\"!");
                   scan.next();
               }
           }

        }

        System.out.println("\n---- Numbers in ArrayList ----");
        for(int i : numbers){
            System.out.println(i);
        }

        scan.close();
    }

}
