package practice.week11;

public class Practical2{
    public static void main(String[] args){
        String[] searchChar = {"a", "i", "m"};
        String sentence = "Kolej Matrikulasi Pulau Pinang";
        String[] arr = sentence.split("");
        int[] count = new int[searchChar.length];
        int i;
        int x;
        for (String element: arr){
            for (x=0;x<searchChar.length;x++){
                if (element.equalsIgnoreCase(searchChar[x])){
                    count[x]++;
                    break;
                }
            }
        }
        for (i=0;i<count.length;i++){
            System.out.println("Frequency of " + searchChar[i] + " = " + count[i]);
        }
    }
}