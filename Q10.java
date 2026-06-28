import java.lang.Math;
public class Q10 {
    public static void main(String[] args) {
        double[] arr = new double[20];
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                arr[i] = Math.pow(i, (3 + 1));
            } else {
                arr[i] = 3;
            }
        }
        System.out.printf("Dvisible by 3 List from array: \n");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                continue;
            }else if(arr[i] % 3 == 0){
                System.out.printf("(%.2f) ", arr[i]);
            }
        }
    }
}