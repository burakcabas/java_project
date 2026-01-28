package example;

import java.util.Scanner;

public class SampleException {

    public static void divideByZero() throws ArithmeticException{
        System.out.println(10/0);
    }

    public static void main(String[] args){

        int[] numbers = {1,2,3,4};

        try{
            System.out.println("numbers[0] is: " + numbers[0]);
            System.out.println("numbers[10] is: " + numbers[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is an ArrayIndexOutOfBoundsException! " + e.getMessage());
        }
        finally{
            System.out.println("This is the finally statement. It means that the \"try-catch\" block is finished.");
        }

        try{
            divideByZero();
        }
        catch (ArithmeticException e){
            System.out.println("We got an ArithmeticException: " + e.getMessage());
        }

        int age;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        age = scan.nextInt();

        if(age >= 18){
            System.out.println("You are above 18. Good to enter.");
        }
        else if(age<18){
            throw new ArithmeticException("You are younger than 18! You can't enter");
        }



    }

}
