import java.lang.Math;


public class keygen {
    public static String rand() {
        int dice = (int) (Math.random() * (11 - 1)) + 1;
        //System.out.printf("%d\n",dice);
        String temp = "";

        if(dice <= 5) {
            double a = Math.random() * (90 - 65) + 65;
            int ab = (int) a;
            char ac = (char) ab;
            temp = String.format("%s",ac);
        } else if(dice > 5) {
            int e = (int) (Math.random() * (10 - 1)) + 1;
            temp = String.format("%d",e);
        }
		
        return temp;
    }
	public static void main(String[] args) {
		for(int i = 0; i < 21; i++){
		    System.out.printf("%s",rand());
        }

	}

}
