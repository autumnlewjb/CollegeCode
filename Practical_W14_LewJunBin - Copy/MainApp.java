import java.util.Scanner;

public class MainApp extends Methods{
    
    public static void main(String[] args){
        MainApp obj = new MainApp();
        obj.displayMessage();
        System.out.println();
        obj.printStatus(7,12);
        System.out.println();
        System.out.println(obj.findArea(6,2));
        System.out.println(obj.isDivisible(6,2));
    }
}