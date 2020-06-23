package practice.week13;

public class Practical4{
    public static void main(String[] args){
        Practical4 obj = new Practical4();
        System.out.println("Sum from 1 to 10 is: " + obj.sumFrom(1,10, 0));
        System.out.println("Sum from 100 to 200 is: " + obj.sumFrom(100,200, 0));
        System.out.println("Sum from 990 to 1000 is: " + obj.sumFrom(990,1000, 0));
        
    }
    
    public int sumFrom(int x, int y, int total){
        if (x > y) {
            return total;
        }else {
            return sumFrom(x+1, y, total+x);
        }
    }
}