package practice.week10;

public class Practical3{
    public static void main(String[] args){
        int[] a = {23,34,13,64,72,90,10,15,9,27};
        int i, max = a[0], min = a[0];
        
        for(i=0;i<a.length;i++){
            if(a[i] > max){
                if(max < min){
                    min = max;
                }
                max = a[i];
            }
            else if(a[i] < min){
                if(min > max){
                    max = min;
                }
                min = a[i];
            }
        }
        System.out.println("Largest Number is: " + max);
        System.out.println("Smallest Number is: " + min);
    }
}