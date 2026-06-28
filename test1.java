import java.util.Scanner;
public class test1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter number of students: ");
        int numstudents = in.nextInt();

        int i = 0;
        while (i < numstudents) {
            System.out.printf("Please enter a name: ");
            in.next();
            i++;
        }
    }
}
