package example;

public class Burak {

    public static void main(String[] args){

        System.out.println("Hello World!");

        int[] numbers;
        int[] numbers1 = {1, 2, 3};
        int[] numbers3 = new int[3];

        int[][] multi;
        int[][] multi1 = {{1,2,3}, {4,5,6}, {7,8}};
        int[][] multi2 = new int[2][3];

        for(int[] art : multi1){
            for(int i : art){
                System.out.print(i);
            }
            System.out.println("wassup brother");
        }

    }

}
