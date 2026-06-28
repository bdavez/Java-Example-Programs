import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.printf("What would you like to encrypt: ");
        String m = inpt.next();
        inpt.close();
        String q = encrypt(m, 2);
        System.out.printf(q);
        System.out.printf("%n");
        System.out.printf("%s%n", decrypt(q, 2));
    }

    public static String encrypt(String message, int n) {
        String temp = "";
        char[] tempArr1 = new char[message.length()];
        int[] tempArr2 = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            tempArr1[i] = Character.toUpperCase(message.charAt(i));
            tempArr2[i] = ((tempArr1[i] * n) % 26) + 65; // % 26 allows for wrapping around then simply adding + 65 to
                                                         // assign it within a range of uppercase letters
        }
        for (int i = 0; i < message.length(); i++) {
            temp += String.format("%c", tempArr2[i]);
        }
        return temp;
    }

    public static String decrypt(String message, int n) {
        String temp = "";
        char[] tempArr1 = new char[message.length()];
        int[] tempArr2 = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            tempArr1[i] = message.charAt(i);
            tempArr2[i] = ((((tempArr1[i] - 65) / n) + 26) % 26) + 65;
        }

        for (int i = 0; i < message.length(); i++) {
            temp += String.format("%c ", tempArr2[i]);
        }
        return temp;
    }

}
