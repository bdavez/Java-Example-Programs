// Brendan Davis
// Student ID: 55107387
import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.printf("Input a sentence: \n");
        String sentence = inpt.next();
        inpt.close();
        int ri = sentence.length();
        int rofl = sentence.length();

        char a[] = new char[ri];
        char b[] = new char[ri];

        for(int i = 0; i < ri; i++){
            a[i] = sentence.charAt(i);
            }


        for(int i = 0; i < ri; i++){      
            b[rofl-1] = a[i];
            rofl--;
            }
 
        System.out.printf("The sentence backwords is: \n");

        for(int i = 0; i < ri; i++){
            System.out.printf("%s", b[i]);
            }
    }
}
