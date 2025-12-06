package example;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Burak {

    public static void main(String[] args){

        boolean[] theTruth = {true, true, false};

        for(boolean i : theTruth){
            System.out.println(i);
        }

        int[] numbers = new int[5]; //this is another way to initiate an array

        int[][] multiDimensionalArray = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};

        for(int[] array : multiDimensionalArray){
            for(int i : array){
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
