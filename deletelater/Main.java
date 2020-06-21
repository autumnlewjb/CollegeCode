import java.util.Scanner;

public class Main{
	int width;
    int length;
    
	public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
        
        System.out.println("Enter width: ");
        int width = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter length: ");
        int length = input.nextInt();
        input.nextLine();
        
        Main obj = new Main(width,length);
        
        System.out.println("Perimeter: " + obj.calPeri());
        System.out.println("Area: " + obj.calArea());
    }
    
    public Main(int width, int length){
    	this.width = width;
        this.length = length;
    }
    
    public int calPeri(){
    	int perimeter = 2 * (length + width);
        return perimeter;
    }
    public int calArea(){
    	int area = length * width;
        return area;
    }
}