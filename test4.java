public class test4 {

    public static void main(String[] args) {
        int count = -1;

        for(int i = 100; i <= 200; i++){
            if((i % 5 == 0) ^ (i % 6 == 0)) {
                System.out.printf("%d ", i); count++;
            }
            if(count % 10 == 9) {
                System.out.printf("\n"); count = -1;
            }
            
        }
        System.out.printf("\n");
    }
}