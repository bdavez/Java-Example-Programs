import java.util.Scanner;
public class E2{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        System.out.println(" Enter a vaild plate number ");
        String platenum = input.nextLine();
        char cha1 = platenum.charAt(0);
        char cha2 = platenum.charAt(1);
        char cha3 = platenum.charAt(2);
          if (Character.isUpperCase(cha1)){ 
            if (Character.isUpperCase(cha2)) {  
                if (cha3 == '-') { System.out.println(" This is looks good");} 
                else {System.out.println(" This is not a vaid input");}
            } else {System.out.println(" This is not a vaid input");}
          } else {System.out.println(" This is not a vaid input");}

    input.close();
    }
}