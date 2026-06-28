import java.util.*;
public class test3 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    int numstudents = in.nextInt();
    ArrayList<String> nameArr = new ArrayList<String>();;
    ArrayList<Double> scoreArr = new ArrayList<Double>();
    ArrayList<Double> tempArr = new ArrayList<Double>();


    int i= 0; 
    while (i < numstudents){
    System.out.println(" Enter a name of student:");
    nameArr.add(in.next());
    System.out.println("Enter the students score");
    scoreArr.add(in.nextDouble());
    i++;
    }
    in.close();
    tempArr.addAll(scoreArr);
    Collections.sort(tempArr);
    int r = numstudents -1;
    double temp1 =  tempArr.get(r);
    double temp2 = tempArr.get(r -1);
    int topIndex1 = scoreArr.indexOf(temp1);
    int topIndex2 = scoreArr.indexOf(temp2);
    
    System.out.println(nameArr.get(topIndex1) + " score is " + scoreArr.get(topIndex1));
    System.out.println(nameArr.get(topIndex2) + " score is " + scoreArr.get(topIndex2));
    }
}
