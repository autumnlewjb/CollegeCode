package practice.week13;

public class Practical1{
    public static void main(String[] args){
        Practical1 obj = new Practical1();
        System.out.println("Total: " + obj.getTotal(89,11));
    }
    public int getTotal(int x, int y){
        int sum = x + y;
        return sum;
    }
}