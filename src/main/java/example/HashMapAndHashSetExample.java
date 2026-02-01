package example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapAndHashSetExample {

    public static void main(String[] args){

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Italy", "Rome");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Slovenia", "Ljubljana");
        capitalCities.put("Slovenia", "Ljubljana"); // this overwrites

        capitalCities.remove("Germany");
        System.out.println(capitalCities.get("Slovenia"));
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.containsKey("Italy"));


        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        for (String i : capitalCities.keySet()){
            System.out.println("Key: " + i + " // Value: " + capitalCities.get(i));
        }

        System.out.println("***************************");

        HashSet<Integer> basicNumbers = new HashSet<Integer>();

        basicNumbers.add(1);
        basicNumbers.add(2);
        basicNumbers.add(3);
        basicNumbers.add(4);
        basicNumbers.add(5);
        basicNumbers.add(1); // this will get ignored because it's a HashSet
        basicNumbers.add(7);

        basicNumbers.remove(7);

        System.out.println(basicNumbers.contains(7));

        System.out.println(basicNumbers.size());

        Iterator<Integer> it = basicNumbers.iterator();

        while(it.hasNext()){
            Integer i = it.next();
            if(i.equals(2)){
                it.remove();
            }
        }

        System.out.println("***************************");

        for(int i : basicNumbers){
            System.out.print(i + " ");
        }

        System.out.println();

    }

}
