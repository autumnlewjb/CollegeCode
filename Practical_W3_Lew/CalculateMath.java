public class CalculateMath{
    public static void main(String[] args){
        int num1 = 9;
        int num2 = 3;
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int remain = num1 % num2;
        
        System.out.printf("Addition %s and %s is %s.\n", num1,num2, add);
        System.out.printf("Subtraction %s and %s is %s.\n", num1,num2, sub);
        System.out.printf("Multiply %s and %s is %s.\n", num1,num2, mul);
        System.out.printf("Quotient %s and %s is %s.\n", num1,num2, div);
        System.out.printf("Remainder %s and %s is %s.\n", num1,num2, remain);
    }
}