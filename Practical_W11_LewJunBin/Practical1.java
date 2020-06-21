import java.util.Arrays;
public class Practical1{
    public static void main(String[] args){
        final String searchChar = "a";
        String sentence = "Kolej Matrikulasi Pulau Pinang";
        String[] arr = sentence.split("a");
        System.out.println(Arrays.toString(arr));
        
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equalsIgnoreCase(searchChar)){
                count++;
            }
        }
        System.out.println("Frequency of " + searchChar + " = " + count);
    }

}