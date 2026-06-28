import java.util.*;
public class Farm {
   public static void main(String[] args) {
      Scanner inpt = new Scanner(System.in);
      Farmer[] farmers = new Farmer[3];
      int player;
      //Mark is a default constructor

      //Jessa was made on the fly
      farmers[0] = new Farmer();
      farmers[1] = new Farmer();
      farmers[1].name = "Jessa";
      farmers[1].weight = 51.4;
      farmers[1].x = 17;
      farmers[1].y = 13;
      farmers[2] = new Farmer("Jennie", 53.4, 19, 13);

      farmers[1].moveRight();
      farmers[1].moveDown();
      farmers[1].moveTo(19,11);

      //brady is made using newest constructor
      //Farmer admin = new Farmer("Brady", 71.1, 9,19);

      System.out.printf("Please select a farmer from 0 - 2: ");
      player = inpt.nextInt();
      System.out.printf("You have selected: %s%n", farmers[player].name);

      Cow cow1 = new Cow();
      System.out.printf("You have been awarded your first pet it is a cow, would you like to give it a nickname?(Y)es or (N)o: ");
      char temp = inpt.next().charAt(0);
      if(temp == 'Y' || temp == 'y') {
         System.out.printf("%nNickname: ");
         String test = inpt.next();
         cow1.setNickname(test);
      }
      System.out.printf("%s has joined your farm!%n",cow1.nickname);
      do {
         System.out.printf("How much would you like to feed the cow? 0 to stop: ");
         String test = inpt.next();
         if(test.charAt(0) == '0') {
            break;
         } else {
            cow1.eat(Integer.parseInt(test));
         }

      }while(!cow1.isFull());
      inpt.close();
   }

}
class Farmer {
   String name;
   double weight;
   int x,y;
   //constructor
   Farmer(String aName, double aWeight, int x1, int y1){
      name = aName;
      weight = aWeight;
      x = x1;
      y = y1;
      }
   Farmer(){
      name = "Mark";
      weight = 60.5;
      x = 20;
      y = 10;
      }
        //'full' attribute is a read only -> no setFull()
      //GETTERS
   public String name() {return name;}
   public void moveUp() {y++;}
   public void moveDown() {y--;}
   public void moveRight(){x++;}
   public void moveLeft() {x--;}
   public void moveTo(int a, int b){
      x = a; y = b;
      }
}

class Cow {
   String nickname;
   double weight;
   int energy;
   int stomach;
   int x,y;
   boolean full;

   Cow(String aName, double aWeight, int x1, int y1, int belly) {
      nickname = aName;
      weight = aWeight;
      x = x1;
      y = y1;
      stomach = belly;
      full = false;
   }
   Cow() {
      nickname = "Cow";
      weight = 89.9;
      x = 10;
      y = 20;
      stomach = 50;
      full = false;
   }

   public void sleep(int hoursSlept) {
      energy += 3 * hoursSlept;
      stomach -= 2 * hoursSlept;
      
      }

   public void eat(int amount) {
      if(amount >= 0)
         setStomach(stomach + amount);
      else if (stomach > 200) {
         System.out.printf("%s, is looking very full", this.nickname);
      }
      else {
         System.out.println("invlaid food amount.");
      }
   }
   public void say(String msg) {
      System.out.println(nickname + " says: " + msg);
      }

      //SETTERS
   public void setNickname(String nickname) {
      char firstchar = nickname.charAt(0);
      int len = nickname.length();
      if(len>=4 && Character.isLetter(firstchar))
         this.nickname = nickname;
      else
      System.out.println("invalid nickname.");
      }
      
   public void setStomach(int stomach) {
      if(stomach >= 0) {
         stomach = stomach>100? 100 : stomach;
         full = (stomach >= 100);
      } else {
      System.out.println("invalid stomach value.");
      }
      }
      //'full' attribute is a read only -> no setFull()
      //GETTERS
      public String getNickname() {return nickname;}
      public int getStomach() {return stomach;}
      public boolean isFull() {return full;}
}

