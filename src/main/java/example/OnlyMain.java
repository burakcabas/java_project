package example;

import java.util.Collections;
import java.util.LinkedList;

public class OnlyMain {

    public static void main(String[] args){

        LinkedList<String> hairstyles = new LinkedList<String>();

        hairstyles.add("curly");
        hairstyles.add("straight");
        hairstyles.add("bun");

        System.out.println(hairstyles);

        Collections.sort(hairstyles);

        System.out.println(hairstyles);

        Collections.sort(hairstyles, Collections.reverseOrder());
        System.out.println(hairstyles);


    }

}
