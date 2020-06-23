package practice.week11;

public class Practical7{
    public static void main(String[] args){
        int[] num = {15,12,13,10,30,55};
        int i;
        for(i=1;i<num.length;i++){
            num[0] += num[i];
        }
        double average = num[0] / num.length;
        System.out.println("Sum of all numbers: " + num[0]);
        System.out.println("Average number is: " + (int)average);
    }
}