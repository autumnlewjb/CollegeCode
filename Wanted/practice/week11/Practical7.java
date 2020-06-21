package practice.week11;

public class Practical7{
    public static void main(String[] args){
        int[] num = {15,12,13,10,30,55};
        int total = 0;
        int i;
        for(i=0;i<num.length;i++){
            total += num[i];
        }
        double average = total / num.length;
        System.out.println("Sum of all numbers: " + total);
        System.out.println("Average number is: " + (int)average);
    }
}