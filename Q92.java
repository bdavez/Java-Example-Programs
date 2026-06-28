// Brendan Davis
// Student ID: 55107387
import java.util.Scanner;

public class Q92 {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.printf("Input a sentence: \n");
        String sentence = inpt.nextLine();
        inpt.close();
        int ri = sentence.length();

        char a[] = new char[ri];

        for(int i = 0; i < ri; i += 3){
            a[i] = sentence.charAt(i);
            }

        System.out.printf("The sentence printing every third char is: \n");

        for(int i = 0; i < ri; i++){
            System.out.printf("%s", a[i]);
            }
    }
}

