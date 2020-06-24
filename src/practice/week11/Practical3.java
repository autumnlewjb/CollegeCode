package practice.week11;

public class Practical3{
    public static void main(String[] args){
        int[] arr = {0,5,5,5,4,2,2,3};
        final int searchValue = 5;
        int count = 0;
        for (int number: arr){
            if (number == searchValue){
                count++;
            }
        }
        System.out.println("Frequency of " + searchValue + " = " + count);
    }
}