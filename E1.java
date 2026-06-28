
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
	Scanner inpt = new Scanner(System.in);
    System.out.printf("Please enter a word: ");
    String word = inpt.nextLine();
    inpt.close();
    char a[] = new char[word.length()];
    char b[] = new char[word.length()];
    int ri = word.length();
    int vowels = 0;
    int uppercase = 0;

    System.out.printf("The word you entered is: \n");
    for(int i = 0; i < word.length(); i++){
        a[i] = word.charAt(i);
        System.out.printf("%s",word.charAt(i)); 
        if(Character.isLetter(a[i])) {
            if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
                vowels++;
            }
            if(Character.(a[i])) {
                uppercase++;
            }
        }
    }
    System.out.printf("\n");

    for(int i = 0; i < word.length(); i++){
        b[i] = a[ri-1];
        System.out.printf("%s",b[i]);
        ri--;
    }
    System.out.printf("\n");
    System.out.println("The number of vowels is: " + vowels);
    System.out.println("The number of uppcase is: " + uppercase);
    }
}