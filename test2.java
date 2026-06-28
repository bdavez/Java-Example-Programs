import java.util.*;
public class test2{
     public static void main(String[] args) {
    // num =sum == perf number
    //6=3.2.1 = 6 
    //28= 14 +7+4+2+1
    //write a program to find the perf num in 10000.. so 10000 = ? + ? + ? + ? 

    int max = 10000;
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    ArrayList<Integer> perfectList = new ArrayList<Integer>();

    for (int a = 2; a <= max; a++){
        int sum = 0;
        int b = 0;
        for ( int i = 1; i <= a; i++){
            if (a % i == 0){
                arrList.add(i);
                b++;
            }
        }
        int rofl = arrList.remove(b-1);
        // for (int i = 0; i < arrList.size(); i++){
        //     System.out.printf("%d " , arrList.get(i));
        // }
        for (int i = 0; i < arrList.size(); i++){
            sum = sum + arrList.get(i);          
        }
        if(rofl == sum) {perfectList.add(rofl);}
        //System.out.printf("%d",rofl);
        //System.out.printf("\n");
        arrList.clear();
    }
    System.out.printf(perfectList.toString());
    }
}
