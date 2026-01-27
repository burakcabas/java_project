package example;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Burak {

    public static void main(String[] args){

        int x = 0;

        boolean[] theTruth = {true, true, false};

        for(boolean i : theTruth){
            System.out.println(i);
        }

        char[] letters = new char[5];

        letters[0] = 'a';
        letters[1] = 'b';
        letters[2] = 'c';
        letters[3] = 'd';
        letters[4] = 'e';

        for(char i : letters){
            System.out.println(i);
        }

        int[][] numbers = new int[2][2];

        numbers[0][0] = 0;
        numbers[0][1] = 1;
        numbers[1][0] = 2;
        numbers[1][1] = 3;

        for(int[] row : numbers){
            for(int i: row){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        outerloop:
        while(x<5){
            switch(x){
                case 0:{
                    System.out.println("zero");
                    break outerloop;
                }
                default:{
                    System.out.println("something else");
                }
            }
            x++;
        }

    }

}
